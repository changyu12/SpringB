package com.example.resumeexam.reply;

import java.time.LocalDateTime;

import com.example.resumeexam.auth.SiteUser;
import com.example.resumeexam.board.Board;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Reply {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(columnDefinition = "TEXT")
	private String content;
	
	private LocalDateTime createDate;
	
	@ManyToOne
	private Board board;
	
	@ManyToOne
	private SiteUser author;
}
