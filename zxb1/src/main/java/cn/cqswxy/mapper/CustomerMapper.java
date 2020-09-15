package cn.cqswxy.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.cqswxy.entity.Customer;

@Repository
public interface CustomerMapper {

	List<Customer> selectAll();
}
