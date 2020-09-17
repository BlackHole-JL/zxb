package cn.cqswxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cqswxy.entity.Customer;
import cn.cqswxy.mapper.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;
	
	@Override
	public List<Customer> findAll() {
		return customerMapper.selectAll();
	}

}
