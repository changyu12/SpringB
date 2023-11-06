package com.example.jpa;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AnswerTests {
	
	@Autowired
	private AnswerRepository answerRepository;
	
	
	void create() {
		Answer a1 = new Answer();
		a1.setSubject("첫번째 답변입니다.");
		a1.setContent("첫번째 내용입니다.");
		
		answerRepository.save(a1);
	}
	
	
	void readlist() {
		List<Answer> list = answerRepository.findAll();
		
		System.out.println(list.size());
		System.out.println(list.get(0).getContent());
	}
	
	
	void readdetail() {
		Optional<Answer> oq = answerRepository.findById(1);
		Answer q = oq.get();
		System.out.println(q.getContent());
	}
	
	void update() {
		Optional<Answer> oq = answerRepository.findById(1);
		Answer q = oq.get();
;	}
}
