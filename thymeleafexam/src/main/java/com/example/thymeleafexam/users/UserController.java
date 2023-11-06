package com.example.thymeleafexam.users;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
@Controller
public class UserController {
	
	@GetMapping("/readlist")
	public String userexam1(Model model) {
		User user = new User();
		
		String[] friendarray = {"민지","하니","다니엘","혜린","혜인"};
		
		user.setFriendarray(friendarray);
		
		model.addAttribute(user);
		
		return "users/readlist";
	}
	
}
