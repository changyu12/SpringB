package com.example.cartexam.cart;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.example.cartexam.user.User;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepository;
	
	@Override
	public Cart readdetailusername() {
		
		//현재 로그인 하여 사용중인 사람의 정보 추출
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		String username= auth.getName();
		
		Optional<Cart> oc = cartRepository.findByUsername(username);
		
		return oc.get();
	}

	@Override
	public void create(User user) {
		Cart cart = new Cart();
		cart.setUser(user);
		cart.setUsername(user.getUsername());
		
		cartRepository.save(cart);
	}

}
