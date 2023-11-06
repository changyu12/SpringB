package com.example.loginexam.customer;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;


public interface CustomerRepository {
	
	//Create
	void create(Map<String, Object> map);
	
	//ReadList
	List<Customer>readlist();
	
	//ReadDetail
	Customer readdetail(String username);
	
	//Update
	void update(Map<String, Object> map);
	
	//Delete
	void delete(String username);
	
}
