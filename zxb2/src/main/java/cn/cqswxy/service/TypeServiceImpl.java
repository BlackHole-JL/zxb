package cn.cqswxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cqswxy.entity.Type;
import cn.cqswxy.mapper.TypeMapper;

@Service
public class TypeServiceImpl implements TypeService {

	@Autowired
	private TypeMapper typeMapper;
	
	@Override
	public List<Type> findAll() {
		return typeMapper.selectAll();
	}

}
