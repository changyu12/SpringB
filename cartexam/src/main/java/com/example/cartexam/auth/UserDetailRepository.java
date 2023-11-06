package com.example.cartexam.auth;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cartexam.user.User;

public interface UserDetailRepository extends JpaRepository<User, Integer> {

	Optional<User> findByusername(String username);
}
