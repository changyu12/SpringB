package com.example.payexam.cart;

import java.util.List;

import com.example.payexam.item.Item;
import com.example.payexam.member.Member;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	
	@OneToMany(mappedBy = "cart", cascade = CascadeType.REMOVE)
	private List<Item> itemList;
	
	@ManyToOne
	private Member member;
	
}
