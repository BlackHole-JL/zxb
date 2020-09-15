package cn.cqswxy.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.cqswxy.entity.Type;

@Repository
public interface TypeMapper {

	List<Type> selectAll();
	
	Type selectById(Integer typeId);
	
}
