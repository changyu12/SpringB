package com.example.notiexam.notice;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NoticeTests {

	@Autowired
	private NoticeService noticeService;
	
	@Test
	void create() {
		
		for (int i = 0 ; i <= 300 ; i++) {
		
		Notice notice = new Notice();
		
			   notice.setCategory(i + "긴급공지");
			   notice.setContent(i + "내용");
			   notice.setTitle(i + "제목");
			   notice.setWriter("찬돌님");
			   notice.setCreateDate(LocalDateTime.now());
		
		noticeService.create(notice);
		}
	}
}
