package com.example.boot3mybatis.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void create(User user) {
		
		//암호화 객체 생성
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		//기존의 그냥 입력받은 그냥 암호를 추출
		String password = user.getPassword();	
		
		//추출한 암호를 암호화 해서 다시 객체에 넣기
		user.setPassword(passwordEncoder.encode(password));
		
		//리파지토리로 전송
		userRepository.create(user);
	}

	@Override
	public List<User> readlist() {
		return userRepository.readlist();
	}

	@Override
	public User readdetail(String username) {
		return userRepository.readdetail(username);
	}

	@Override
	public void update(User user) {
		userRepository.update(user);

	}

	@Override
	public void delete(String username) {
		userRepository.delete(username);


	}

}