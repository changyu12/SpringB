package com.example.emall;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.emall.auth.UserDetailService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;



@Controller
public class MainController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/naverlogin")
	public String naverlogin() {
		return "naverlogin";
}
	
	@Autowired
	private UserDetailService userDetailService;
	
	@GetMapping("/logincheck")
	public String logincheck(@RequestParam String email) {
		int result = userDetailService.logincheck(email);
		
		if (result == 1) { //디비에 회원정보가 이미 있을 경우 로그인 성공
			return "redirect:/"; 
		} else {           //디비에 회원정보가 이미 없는 경우 회원 가입
			return "redirect:/member/create";
		}
	}
	@PostMapping("/kakaocheck")
	public String ajaxkakao(HttpServletRequest req, @RequestParam("uesrname") String username) {
		System.out.println("컨트롤러로 넘어온 데이터 값 : " + username);

		 
		
		if (username != null) {
			System.out.println("디비에 회원정보 있음 즉 이미 회원임");
			//디비에 있는 사용자이므로 로그인 세션처리
			//독자적인 처리가 아니라 스프링 시큐리티 규격에 맞게 세션처리
			List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
			list.add(new SimpleGrantedAuthority("ROLE_USER"));
			
			SecurityContext sc = SecurityContextHolder.getContext();
			
			sc.setAuthentication(new UsernamePasswordAuthenticationToken(username, null, list));
			// user 회원정보 객체, null 패스워드 , list 권한 설정
			
			HttpSession session = req.getSession(true);
			
			session.setAttribute(
					HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY, sc);
			
			return "/login";
		} else {
			System.out.println("디비에 회원정보 없음 즉 회원이 아님");
			return "";
		}
	
}
}
