package com.example.demoexam.auth;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerUserDetailsRepository {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	
	public CustomerUserDetails getUserById(String username) {
		CustomerUserDetails user = sqlSessionTemplate.selectOne("customer.getUserById", username);
		
		return user;
	}
	
}
