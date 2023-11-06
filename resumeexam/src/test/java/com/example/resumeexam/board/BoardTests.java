package com.example.resumeexam.board;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

	@SpringBootTest
	public class BoardTests {
		
		@Autowired
		private BoardRepository boardRepository;
		
		//create
		@Test
		void create() {
			
			for(int i = 1; i<= 99; i++) {
				
	
			Board b = new Board();
			b.setSubject("굿모닝 입니다");
			b.setContent("좋은 아침 입니다");
			b.setCreateDate(LocalDateTime.now());
			
			boardRepository.save(b); //save 는 JPA문법
			}
		}
		
		//readlist
		
		void readlist() {
			List<Board> list = boardRepository.findAll();
			System.out.println(list.size());
			
			Board b = list.get(0);
			System.out.println(b.getSubject());
		}
		//readdetail
		
		void readdetail() {
			Optional<Board> ob = boardRepository.findById(4);
			Board b = ob.get();
			System.out.println(b.getSubject());
		}
		
		
		//subject 필드에서 원하는 값 찾기
		
		void findBysubject() {
			
			Board b = this.boardRepository.findBySubject("굿모닝");
			System.out.println(b.getSubject());
		}
		
		//subject 그리고 content 필드에서 원하는 값 찾기
		
		void findBysubjectAndContent() {
			
			Board b = this.boardRepository.findBySubjectAndContent("굿모닝","좋은아침");
			System.out.println(b.getSubject());
		}
		
		
		//일부 글자가 포함되는 모든값 찾기
				
				void findBysubjectAndLike() {
					
					List<Board> list = this.boardRepository.findBySubjectLike("제목");
					System.out.println(list.size());
				}
		
		//update
			
		void update() {
			Optional<Board> ob = boardRepository.findById(1);
			Board b = ob.get();
			b.setSubject("굿이브닝 입니다");
			b.setContent("좋은 밤 입니다");
			b.setCreateDate(LocalDateTime.now());
			
			boardRepository.save(b); //save 는 JPA문법
			
		}
		
		//delete
		void delete() {
			Optional<Board> ob = boardRepository.findById(1);
			Board b = ob.get();
			boardRepository.delete(b);
		}
	}

