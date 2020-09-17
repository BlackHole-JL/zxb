package cn.cqswxy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.cqswxy.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("listPage")
	public ModelAndView listPage(ModelAndView modelAndView){
		modelAndView.addObject("list", customerService.findAll());
		modelAndView.setViewName("/WEB-INF/jsp/listPage.jsp");
		return modelAndView;
	}
	
	@RequestMapping("/main1")
	public ModelAndView main1(ModelAndView modelAndView){
		modelAndView.setViewName("/WEB-INF/jsp/main1.jsp");
		return modelAndView;
	}
	@RequestMapping("/main2")
	public ModelAndView main2(ModelAndView modelAndView){
		modelAndView.setViewName("/WEB-INF/jsp/main2.jsp");
		return modelAndView;
	}
}
