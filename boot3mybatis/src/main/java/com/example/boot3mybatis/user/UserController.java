package com.example.boot3mybatis.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



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
		
		return "user/create";
	}
	
	@GetMapping("/readlist")
	public String readlist(Model model) {
		
		
		List<User> users = userService.readlist();
		
		model.addAttribute("users", users);
		
		return "user/readlist";
	}
	
	@GetMapping("/readdetail")
	public String readdetail(Model model,
							 @RequestParam String username) {
		
		User user = userService.readdetail(username);
		
		model.addAttribute("user", user);
		
		return "user/readdetail";
	}
	
	@GetMapping("/update")
	public String update(Model model,@RequestParam String username) {
		
		
		
		
		
		 model.addAttribute("user",userService.readdetail(username));
		
		return "user/update";
	}
	
	@PostMapping("/update")
	public String update(User user) {
		
		userService.update(user);
		
		return "redirect:/user/readlist";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam ("username") String username) {
		
		userService.delete(username);
		
		return "redirect:/user/readlist";
	}
	

	
}
