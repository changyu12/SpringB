package com.example.payexam.cart;

import java.util.List;

import com.example.payexam.cart.item.Item;
import com.example.payexam.member.Member;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String username;
	
	//게시판 하나에 리플이 여러개, 카트하나에 아이템이 여러개
	@OneToMany(mappedBy = "cart", cascade = CascadeType.REMOVE)
	private List<Item> itemList;
	
	
	@ManyToOne
	private Member member;
	
	//사용자 한명이 여러개의 게시물 작성, 사람한명이 여러개의 카트 @ManyToOne
		
}
