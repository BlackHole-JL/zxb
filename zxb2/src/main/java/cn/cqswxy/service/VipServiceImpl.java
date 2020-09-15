package cn.cqswxy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cqswxy.entity.Vip;
import cn.cqswxy.mapper.VipMapper;

@Service
public class VipServiceImpl implements VipService {

	@Autowired
	private VipMapper vipMapper;
	
	@Override
	public Vip findVip(Vip vip) {
		return vipMapper.selectVip(vip);
	}

	@Override
	public void modVip() {
		vipMapper.updateVip();
	}

}
