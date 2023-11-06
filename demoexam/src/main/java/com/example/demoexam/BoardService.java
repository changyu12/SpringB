package com.example.demoexam;

import java.util.List;
import java.util.Map;

public interface BoardService {
	//Create
		void create(Map<String, Object> map);
		
		//ReadList
		List<Board>readlist();
		
		//ReadDetail
		Board readdetail(String bno);
		
		//Update
		void update(Map<String, Object> map);
		
		//Delete
		void delete(String bno);
}
