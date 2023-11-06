package com.example.resumeexam.reply;

import org.springframework.data.jpa.repository.JpaRepository;



public interface ReplyRepository extends JpaRepository<Reply, Integer> {
	Reply findByContent(String content);
}
