package com.example.cartexam.auth;

import java.util.Optional;

import com.example.cartexam.user.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDetailRepository extends JpaRepository<User, Integer> {


	 Optional<User> findByusername(String username);

	

}
