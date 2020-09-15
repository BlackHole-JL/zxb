package cn.cqswxy.service;

import java.util.List;

import cn.cqswxy.entity.Goods;

public interface GoodsService {

	List<Goods> findBySome(Goods goods);
	
	void delOne(Integer goodsId);
	
	void addOne(Goods goods);
	
}
