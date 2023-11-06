package com.example.payexam.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.payexam.member.Member;


@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartRepository cartRepository;

	@Override
	public void create(Member member) {

		Cart cart = new Cart();
		
		cart.setMember(member);
		cart.setUsername(member.getUsername());
		
		cartRepository.save(cart);

	}

	@Override
	public Cart readdetail(String username) {
		// TODO Auto-generated method stub
		return cartRepository.findByUsername(username);
	}

}
