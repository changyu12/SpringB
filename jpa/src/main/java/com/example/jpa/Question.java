package com.example.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity //DB에 테이블 생성
@Data
public class Question {
	
	@Id //기본값설정
	@GeneratedValue(strategy = GenerationType.IDENTITY) //자동증가
	private Integer id;
	
	@Column(length = 100)	// 필드의 크기를 설정
	private String subject;
	
	@Column(columnDefinition = "TEXT")	// 필드의 종류를 설정
	private String content;
}
