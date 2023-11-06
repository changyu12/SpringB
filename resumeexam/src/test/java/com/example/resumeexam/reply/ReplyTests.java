package com.example.resumeexam.reply;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.resumeexam.board.Board;
import com.example.resumeexam.board.BoardRepository;

@SpringBootTest
public class ReplyTests {

	@Autowired
	private BoardRepository boardRepository;
	
	@Autowired
	private ReplyRepository replyRepository;
	
	@Test
	void create() {
		Optional<Board> oq = boardRepository.findById(3);
		//jpa에서 하나의 게시물을 조회할때는 막바로 객체 추출할 수는 없고
		//Optional 을 거쳐서 객체로 추출한다.
		assertTrue(oq.isPresent());
		Board q = oq.get();
		
		Reply r = new Reply();
		r.setContent("두번째 리플");
		r.setBoard(q);//게시물 객체를 넣어준다.
		r.setCreateDate(LocalDateTime.now());
		
		replyRepository.save(r);
		
	}
	
	
	//readlist
	
	void readlist() {
		List<Reply> list = replyRepository.findAll();
		System.out.println(list.size());
		
		Reply r = list.get(0);
		System.out.println(r.getContent());
	}
	//readdetail
	
	void readdetail() {
		Optional<Reply> or = replyRepository.findById(1);
		Reply r = or.get();
		System.out.println(r.getContent());
	}
	
	//update

	void update() {
	Optional<Reply> or = replyRepository.findById(1);
	Reply r = or.get();
	r.setContent("좋은 밤 입니다");
	r.setCreateDate(LocalDateTime.now());
	
	replyRepository.save(r); //save 는 JPA문법
	
}

//delete
void delete() {
	Optional<Reply> or = replyRepository.findById(1);
	Reply r = or.get();
	replyRepository.delete(r);
}
}
