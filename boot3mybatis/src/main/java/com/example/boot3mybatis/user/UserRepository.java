package com.example.boot3mybatis.user;

import java.util.List;



public interface UserRepository {
	
	//Create
	void create(User user);
	
	//ReadList
	List<User>readlist();
	
	//ReadDetail
	User readdetail(String username);
	
	//Update
	void update(User user);
	
	//Delete
	void delete(String username);
}
