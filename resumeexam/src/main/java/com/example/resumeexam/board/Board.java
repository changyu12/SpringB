package com.example.resumeexam.board;

import java.time.LocalDateTime;
import java.util.List;

import com.example.resumeexam.auth.SiteUser;
import com.example.resumeexam.reply.Reply;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 200)
	private String subject;

	@Column(columnDefinition = "TEXT")
	private String content;
	
	private LocalDateTime createDate;
	
	//게시판 하나에 리플이 여러개 
	@OneToMany(mappedBy = "board", cascade = CascadeType.REMOVE)
	private List<Reply> replyList;
	
	//사용자 한명이 여러개의 게시물 작성
	@ManyToOne
	private SiteUser author;
	
	//1대1 관계 @ManyToMany
}
