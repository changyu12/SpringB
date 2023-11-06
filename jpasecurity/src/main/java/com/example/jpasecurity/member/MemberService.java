package com.example.jpasecurity.member;

import java.util.List;

public interface MemberService {
	//create
	void create(Member member);
	
	//readlist
	List<Member> readlist();
	
	//readdetail
	Member readdetail(Integer id);
	
	//update
	void update(Member member);
	
	//delete
	void delete(Integer id);
}
