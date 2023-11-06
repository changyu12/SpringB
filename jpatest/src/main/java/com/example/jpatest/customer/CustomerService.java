package com.example.jpatest.customer;

import java.util.List;

public interface CustomerService {
	//create
	void create(Customer customer);
	
	//readlist
	List<Customer> readlist();
	
	//readdetail
	Customer readdetail(Integer id);
	
	//update
	void update(Customer customer);
	
	//delete
	void delete(Integer id);
}
