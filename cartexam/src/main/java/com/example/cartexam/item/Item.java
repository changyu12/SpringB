package com.example.cartexam.item;

import java.time.LocalDateTime;

import com.example.cartexam.cart.Cart;
import com.example.cartexam.user.User;

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
	
	private double price;
	
	private String productid;
	
	private LocalDateTime createdate;
	
	@ManyToOne
	private Cart cart;
	
	@ManyToOne
	private User user;
}
