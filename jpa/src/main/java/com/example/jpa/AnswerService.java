package com.example.jpa;

import java.util.List;

public interface AnswerService {

	void create(Answer answer);
	
	List<Answer> readlist();
	
	Answer readdetail(Integer id);
	
	void update(Answer answer);
	
	void delete(Integer id);
}
