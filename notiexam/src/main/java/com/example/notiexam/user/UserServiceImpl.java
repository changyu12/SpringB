package com.example.notiexam.user;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	public void create(User user) {
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		System.out.println("변환전 출력 :" + user.getPassword());
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		System.out.println("변환후 출력 :" + user.getPassword());

		user.setCreateDate(LocalDateTime.now());
		userRepository.save(user);
		
		

		
	}
	
	public User readdetailusername() {
		
		//현재 로그인 하여 사용중인 사람의 정보 추출
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName();
		
		Optional<User> uc = userRepository.findByusername(username);
		
		return uc.get();
	}
}
