package com.example.resumeexam.board;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;



public interface BoardService {
	
	//create
	void create(String subject, String content);
	

	//readdetail
	Board readdetail(Integer id);
	
	//update
	void update(String subject, String content, Integer id);
	
	//delete
	void delete(Integer id);
	
	//page
	Page<Board> findAll(int page);
}
