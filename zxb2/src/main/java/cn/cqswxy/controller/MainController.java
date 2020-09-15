package cn.cqswxy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import cn.cqswxy.entity.Goods;
import cn.cqswxy.entity.Vip;
import cn.cqswxy.service.GoodsService;
import cn.cqswxy.service.TypeService;
import cn.cqswxy.service.VipService;

@Controller
@SessionAttributes("vip")
public class MainController {

	@Autowired
	private GoodsService goodsService;
	@Autowired
	private TypeService typeService;
	@Autowired
	private VipService vipService;
	
	@RequestMapping("loginPage")
	public ModelAndView loginPage(ModelAndView modelAndView) {
		modelAndView.setViewName("/WEB-INF/jsp/loginPage.jsp");
		return modelAndView;
	}
	
	@RequestMapping("mainPage")
	public ModelAndView mainPage(ModelAndView modelAndView,HttpServletRequest request,Goods goods) {
		HttpSession session = request.getSession();
		Vip vip = (Vip)session.getAttribute("vip");
		if (vip == null) {
			modelAndView.setViewName("redirect:loginPage.do");
		}else{
			modelAndView.addObject("list", goodsService.findBySome(goods));
			modelAndView.addObject("typeList", typeService.findAll());
			modelAndView.setViewName("/WEB-INF/jsp/main.jsp");
		}
		return modelAndView;
	}
	
	@RequestMapping("exit")
	public ModelAndView exit(ModelAndView modelAndView,HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("vip");
		modelAndView.setViewName("redirect:loginPage.do");
		return modelAndView;
	}
	
	@RequestMapping("delGoods")
	public ModelAndView delGoods(ModelAndView modelAndView,Integer goodsId) {
		goodsService.delOne(goodsId);
		modelAndView.setViewName("redirect:mainPage.do");
		return modelAndView;
	}

	@RequestMapping("addPage")
	public ModelAndView addPage(ModelAndView modelAndView) {
		modelAndView.addObject("typeList", typeService.findAll());
		modelAndView.setViewName("/WEB-INF/jsp/addPage.jsp");
		return modelAndView;
	}
	
	@RequestMapping("addSubmit")
	public ModelAndView addSubmit(ModelAndView modelAndView,Goods goods) {
		goodsService.addOne(goods);
		modelAndView.setViewName("redirect:mainPage.do");
		return modelAndView;
	}
	
	@RequestMapping("loginSubmit")
	public ModelAndView loginSubmit(ModelAndView modelAndView,Vip vip) {
		Vip findVip = vipService.findVip(vip);
		if(findVip != null){
			modelAndView.addObject("vip", findVip);
			modelAndView.setViewName("redirect:mainPage.do");
		}else{
			modelAndView.addObject("error", "账号或密码错误");
			modelAndView.setViewName("loginPage.do");
		}
		return modelAndView;
	}
}
