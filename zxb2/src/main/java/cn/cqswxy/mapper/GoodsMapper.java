package cn.cqswxy.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.cqswxy.entity.Goods;

@Repository
public interface GoodsMapper {

	List<Goods> selectBySome(Goods goods);
	
	Integer delectOne(Integer goodsId);
	
	Integer insertOne(Goods goods);
}
