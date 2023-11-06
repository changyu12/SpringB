package com.example.payexam.cart.item;

import java.time.LocalDateTime;

import com.example.payexam.cart.Cart;
import com.example.payexam.member.Member;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String productid;
	
	private double price;
	
	private int number;
	
	private LocalDateTime createDate;
	
	@ManyToOne
	private Cart cart; 
	
	@ManyToOne
	private Member member;
	
	
	
	
}
