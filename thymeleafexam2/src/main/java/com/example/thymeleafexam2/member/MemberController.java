package com.example.thymeleafexam2.member;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/member")
@Controller
public class MemberController {

	@GetMapping("/create")
	public String create(Model model) {
		
		model.addAttribute("member", new Member());
		return "member/create";
	}
	
	@PostMapping("/create")
	public String create(Member member) {
		
		System.out.println(member.getMnation());
		
		return "member/create";
	}
	
	@GetMapping("/readdetail")
	public String readdetail(Model model) {
		
		Member member = new Member();
		
		member.setMid("1");
		member.setMname("어스틴");
		member.setMpw("0000");
		
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy년 M월 d일 (E) a h시 m분 s초");
		
		model.addAttribute("nowtime", now.format(formatter));
		model.addAttribute("member",member);
		
		return "member/readdetail";
	}
}
