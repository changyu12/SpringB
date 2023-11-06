package com.example.jpatest.auth;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpatest.customer.Customer;

public interface UserDetailRepository extends JpaRepository<Customer, Integer> {

	Optional<Customer> findByusername(String username);
}
