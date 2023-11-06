package com.example.boot3mybatis.notice;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface NoticeService {
	
	//Create
	void create(Notice notice, MultipartFile file);
	
	//ReadList
	List<Notice>readlist();
	
	//ReadDetail
	Notice readdetail(String nid);
	
	//Update
	void update(Notice notice,MultipartFile file);
	
	//Delete
	void delete(String nid);

	
}
