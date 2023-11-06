package com.example.payexam.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.payexam.cart.CartRepository;
import com.example.payexam.cart.CartService;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private CartService cartService;
	
	//create
	@Override
	public void create(Member member) {
		
		
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		member.setPassword(passwordEncoder.encode(member.getPassword()));
		memberRepository.save(member);
		
		//회원 가입을 성공적으로 수행하고 쇼핑몰의 특성상 각 회원에게 이 시점에서 카트를 하나씩 생성
		cartService.create(member);
	
	}

}
