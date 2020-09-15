package cn.cqswxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cqswxy.entity.Goods;
import cn.cqswxy.mapper.GoodsMapper;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsMapper goodsMapper;
	
	@Override
	public List<Goods> findBySome(Goods goods) {
		return goodsMapper.selectBySome(goods);
	}

	@Override
	public void delOne(Integer goodsId) {
		goodsMapper.delectOne(goodsId);
	}

	@Override
	public void addOne(Goods goods) {
		goodsMapper.insertOne(goods);
	}

}
