package com.example.notiexam.notice;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.notiexam.user.User;

public interface NoticeService {

	void create(Notice notice);
	
	List<Notice> readlist();
	
	Notice readdetail(Integer id);
	
	void update(Notice notice);
	
	void delete(Integer id);
	
	Page<Notice> getList(int page);
	
	void vote(Notice notice, User user);
	
	void hate(Notice notice, User user);
	
	void hit(Notice notice, User user);
}
