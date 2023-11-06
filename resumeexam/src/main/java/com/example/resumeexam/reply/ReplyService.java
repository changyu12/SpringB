package com.example.resumeexam.reply;

import com.example.resumeexam.board.Board;

public interface ReplyService {

	void create(Integer id, String content);
	
	//delete
	void delete(Integer id);
}
