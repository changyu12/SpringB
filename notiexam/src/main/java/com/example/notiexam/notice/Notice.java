package com.example.notiexam.notice;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import com.example.notiexam.comment.Comment;
import com.example.notiexam.user.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Notice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String title;
		
	private String content;
	
	private String writer;
	
	private String category;
	
	private LocalDateTime createDate;
	
	@OneToMany(mappedBy = "notice", cascade = CascadeType.REMOVE)
	private List<Comment> commentList;
	
	//추천  조아요
	@ManyToMany
	List<User> voter;
	
	//비추  시러요
	@ManyToMany
	List<User> hater;
	
	//게시물 조회수
	@ManyToMany
	List<User> hitter;
}
