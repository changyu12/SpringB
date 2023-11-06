package com.example.resumeexam.board;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Integer> {
	//제목찾기
	Board findBySubject(String subject);
	//제목 또는 내용 찾기
	Board findBySubjectAndContent(String subject, String content);
	//제목과 같은 일부글자가 포함되는거 다 찾기
	List<Board> findBySubjectLike(String subject);
		
	Page<Board> findAll(Pageable pageable);
	

}
