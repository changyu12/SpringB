package com.example.demoexam;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardRepository boardRepository;
	
	
	@Override
	public void create(Map<String, Object> map) {
		boardRepository.create(map);

	}

	@Override
	public List<Board> readlist() {
		
		return boardRepository.readlist();
	}

	@Override
	public Board readdetail(String bno) {
		
		return boardRepository.readdetail(bno);
	}

	@Override
	public void update(Map<String, Object> map) {
		boardRepository.update(map);
		

	}

	@Override
	public void delete(String bno) {
		boardRepository.delete(bno);

	}

}
