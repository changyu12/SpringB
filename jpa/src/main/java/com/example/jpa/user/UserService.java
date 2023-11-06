package com.example.jpa.user;

import java.util.List;
import java.util.Optional;



public interface UserService {
	
	//create
	void create(User question);
	
	//readlist
	List<User> readlist();
	
	//readdetail
	User readdetail(Integer id);
	
	//update
	void update(User question);
	
	//delete
	void delete(Integer id);
}
