package com.example.jpa;

import java.util.List;
import java.util.Optional;



public interface QuestionService {
	
	//create
	void create(Question question);
	
	//readlist
	List<Question> readlist();
	
	//readdetail
	Question readdetail(Integer id);
	
	//update
	void update(Question question);
	
	//delete
	void delete(Integer id);
}
