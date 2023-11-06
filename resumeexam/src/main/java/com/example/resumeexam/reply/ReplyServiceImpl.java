package com.example.resumeexam.reply;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.resumeexam.board.Board;
import com.example.resumeexam.board.BoardService;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Autowired
	private BoardService boardService;
	
	@Autowired
	private ReplyRepository replyRepository;
	
	
	@Override
	public void create(Integer id, String content) {
		Board board = boardService.readdetail(id);
		
		Reply reply = new Reply();
		
		reply.setContent(content);
		reply.setCreateDate(LocalDateTime.now());
		reply.setBoard(board);
		
		replyRepository.save(reply);
		
	}
	
	@Override
	public void delete(Integer id) {
		//옵셔널은 null을 체크하기 위해서 쓴다.
		Optional<Reply> oq = replyRepository.findById(id);
		Reply q = oq.get();
		replyRepository.delete(q);
		
		
		
	}
}
