package com.example.demoexam.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomerUserDetailsService implements UserDetailsService {

	@Autowired
	private CustomerUserDetailsRepository customerUserDetailsRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserDetails user = customerUserDetailsRepository.getUserById(username);
		
		if(user == null) {
			throw new UsernameNotFoundException("username" + username + " not found");
		}
		
		return user;
	}

}
