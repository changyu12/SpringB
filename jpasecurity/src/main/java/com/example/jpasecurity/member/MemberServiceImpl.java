package com.example.jpasecurity.member;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepository memberRepository;
	
	
	//create
		@Override
		public void create(Member member) {
			
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			
			member.setPassword(passwordEncoder.encode(member.getPassword()));
			memberRepository.save(member);
		}


	@Override
	public List<Member> readlist() {
		
		return memberRepository.findAll();
	}


	@Override
	public Member readdetail(Integer id) {
		Optional<Member> oq = memberRepository.findById(id);
		Member q = oq.get();
		return q;
	}


	@Override
	public void update(Member member) {
		Integer id = member.getId();
		String username = member.getUsername();
		String password = member.getPassword();
		
		Optional<Member> oq = memberRepository.findById(id);
		Member q = oq.get();
		
		q.setUsername(username);
		q.setPassword(password);
		memberRepository.save(q);
		
	}


	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
