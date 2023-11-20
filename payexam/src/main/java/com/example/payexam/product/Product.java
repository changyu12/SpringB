package com.example.payexam.product;

import java.time.LocalDateTime;
import java.util.Set;

import com.example.payexam.member.Member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Product {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;
	
	private double price;
	
	@Column(columnDefinition = "LONGTEXT")
	private String about;
	
	private String productid;
	
	private int quantity;
	
	private String imgname;
	
	private LocalDateTime createDate;
	
	@ManyToMany
	Set<Member> voter;
	
	
	
	
}
