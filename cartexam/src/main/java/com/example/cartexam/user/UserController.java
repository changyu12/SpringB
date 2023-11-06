package com.example.cartexam.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/create")
	public String create() {
		return "user/create";
	}
	
	@PostMapping("/create")
	public String create(User user) {
		
		userService.create(user);
		
		return "redirect:/";
	}
	
}
