package com.example.y.board;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;


public interface BoardService {
	
	//Create
	void create(Map<String, Object> map, MultipartFile file);
	
	//ReadList
	List<Board>readlist();
	
	//ReadDetail
	Board readdetail(String bno);
	
	//Update
	void update(Map<String, Object> map);
	
	//Delete
	void delete(String bno);
	
}
