package com.example.resumeexam.board;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardRepository boardRepository;
	
	/*
	 * @Override public void create(Board board) {
	 * 
	 * 
	 * boardRepository.save(board); }
	 */


	@Override
	public Board readdetail(Integer id) {
		//옵셔널은 null을 체크하기 위해서 쓴다.
		Optional<Board> oq = boardRepository.findById(id);
		Board q = oq.get();
		
		return q;
		
	}

	
	
	@Override
	public void delete(Integer id) {
		//옵셔널은 null을 체크하기 위해서 쓴다.
		Optional<Board> oq = boardRepository.findById(id);
		Board q = oq.get();
		boardRepository.delete(q);
		
		
		
	}

	@Override
	public void create(String subject, String content) {
		Board board = new Board();
		
		board.setSubject(subject);
		
		board.setContent(content);
		
		board.setCreateDate(LocalDateTime.now());
		
		boardRepository.save(board);
		
	}

	@Override
	public Page<Board> findAll(int page) {
		Pageable pageable = PageRequest.of(page,10);
		return boardRepository.findAll(pageable);
	}

	@Override
	public void update(String subject, String content,Integer id) {
		
		Optional<Board> ob = boardRepository.findById(id);
		Board board = ob.get();
		
		board.setSubject(subject);
		board.setContent(content);
		board.setCreateDate(LocalDateTime.now());
		
		boardRepository.save(board); //save 는 JPA문법
		
	}

	


	

	


}
