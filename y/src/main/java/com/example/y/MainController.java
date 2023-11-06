package com.example.y;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.y.auth.CustomerUserDetailsService;



@Controller
public class MainController {

	@GetMapping("/login")
	public String login() {
		return "login";
}
	

	@GetMapping("/naverlogin")
	public String naverlogin() {
		return "naverlogin";
}
	
	@Autowired
	private CustomerUserDetailsService customerUserDetailsService;
	
	@GetMapping("/logincheck")
	public String logincheck(@RequestParam String email) {
		int result = customerUserDetailsService.logincheck(email);
		
		if (result == 1) { //디비에 회원정보가 이미 있을 경우 로그인 성공
			return "redirect:/"; 
		} else {           //디비에 회원정보가 이미 없는 경우 회원 가입
			return "redirect:/customer/create";
		}
	}
}