package com.example.emall.auth;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.emall.member.Member;



public interface UserDetailRepository extends JpaRepository<Member, Integer> {

	Optional<Member> findByusername(String username);
}
