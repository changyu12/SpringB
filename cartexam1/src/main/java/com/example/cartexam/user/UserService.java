package com.example.cartexam.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
 class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
//	@Autowired
//	private CartService cartService;
	
	public void create(User user) {
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		System.out.println("변환전 출력 :" + user.getPassword());
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		System.out.println("변환후 출력 :" + user.getPassword());

		userRepository.save(user);
		
		
		// 카트 생성
		
		//cartService.create(user);
		
	}

}
