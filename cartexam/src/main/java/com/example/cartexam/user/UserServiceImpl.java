package com.example.cartexam.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import com.example.cartexam.cart.CartService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CartService cartService;
	
	//create
	@Override
	public void create(User user) {
		
		
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userRepository.save(user);
		
		//카트생성
		cartService.create(user);
	
	}

	
	public User readdetailusername() {
		
		//현재 로그인 하여 사용중인 사람의 정보 추출
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
				
		String username= auth.getName();
				
		Optional<User> uc = userRepository.findByusername(username);
		
		return uc.get();
	}
}
