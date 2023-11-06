package com.example.payexam.cart;

import com.example.payexam.member.Member;

public interface CartService {

	void create(Member member);
	
	Cart readdetail (String username);
}
