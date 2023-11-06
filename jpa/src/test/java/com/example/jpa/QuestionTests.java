package com.example.jpa;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QuestionTests {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	//create
	
	void create() {
		Question q1 = new Question();
		q1.setSubject("첫번째 제목입니다.");
		q1.setContent("첫 내용입니다.");
		
		questionRepository.save(q1);
		
	}
	
	//readlist
	
	void readlist() {
		List<Question> list = questionRepository.findAll();
		
		System.out.println(list.size());
		System.out.println(list.get(0).getContent());
	}
	
	//readdetail

	void readdetail() {
		//기존 방식은 하나의 객체를 조회해서 객체에 바로 넣었으나
		//jpa에서는 이렇게 동작하지 않는다.
		//Question q = questionRepository.findById(1);
		Optional<Question> oq = questionRepository.findById(2);
		Question q = oq.get();
		System.out.println(q.getContent());
	}
	
	//update
	
	void update() {
		//확인용
		Optional<Question> oqb = questionRepository.findById(2);
		Question qtb = oqb.get();
				
		System.out.println(qtb.getContent());
		
		//실제 변경처리
		Optional<Question> oq = questionRepository.findById(2);
		Question q = oq.get();
		q.setContent("수정된 내용");
		questionRepository.save(q);
		
		//확인용
		Optional<Question> oqt = questionRepository.findById(2);
		Question qt = oqt.get();
		
		System.out.println(qt.getContent());
	}
	
	
	
	//delete
	
	void delete() {
		//삭제전의 전체 갯수 확인용
		List<Question> list = questionRepository.findAll();
		System.out.println(list.size());
		
		//게시물 삭제
		Optional<Question> oq = questionRepository.findById(1);
		Question q = oq.get();
		questionRepository.delete(q);
		
		//삭제후의 전체 갯수 확인용
		List<Question> list1 = questionRepository.findAll();
		System.out.println(list1.size());
		
		
	}
	
}
