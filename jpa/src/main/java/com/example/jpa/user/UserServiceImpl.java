package com.example.jpa.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void create(User user) {

		
		userRepository.save(user);
	}

	@Override
	public List<User> readlist() {
		return  userRepository.findAll();
		
	}

	@Override
	public User readdetail(Integer id) {

		Optional<User> oq = userRepository.findById(id);
		User q = oq.get();
		
		return q;
		
	}

	@Override
	public void update(User user) {

		userRepository.save(user);
		
	}
	
	@Override
	public void delete(Integer id) {
		Optional<User> oq = userRepository.findById(id);
		User q = oq.get();
		userRepository.delete(q);
		
		
		
	}


	

	


}
