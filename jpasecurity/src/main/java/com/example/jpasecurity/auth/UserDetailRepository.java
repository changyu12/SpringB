package com.example.jpasecurity.auth;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpasecurity.member.Member;

public interface UserDetailRepository extends JpaRepository<Member, Integer> {

	Optional<Member> findByusername(String username);
}
