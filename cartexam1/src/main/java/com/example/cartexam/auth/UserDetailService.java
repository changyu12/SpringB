package com.example.cartexam.auth;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.cartexam.user.User;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserDetailService implements UserDetailsService {

	private final UserDetailRepository userDetailRepository;
	
	@Override
	public User loadUserByUsername(String username) throws UsernameNotFoundException {
		
		System.out.println("리파지토리집인후 바로 출력 : " + username);
		
	Optional<User> tuser = this.userDetailRepository.findByusername(username);
	User user = tuser.get();
	
	System.out.println(" 조회 후 바로 출력 : " + user.getPassword());

		if(tuser.isEmpty()) {
			throw new UsernameNotFoundException("username" + username + " not found");
		}
		
	return user;
	}
}