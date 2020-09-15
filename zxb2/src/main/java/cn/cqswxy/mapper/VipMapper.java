package cn.cqswxy.mapper;

import org.springframework.stereotype.Repository;

import cn.cqswxy.entity.Vip;

@Repository
public interface VipMapper {

	Vip selectVip(Vip vip);
	
	int updateVip();
}
