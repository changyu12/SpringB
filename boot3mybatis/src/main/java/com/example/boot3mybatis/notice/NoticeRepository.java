package com.example.boot3mybatis.notice;

import java.util.List;



public interface NoticeRepository {
	
	//Create
	void create(Notice notice);
	
	//ReadList
	List<Notice>readlist();
	
	//ReadDetail
	Notice readdetail(String nid);
	
	//Update
	void update(Notice notice);
	
	//Delete
	void delete(String nid);
}
