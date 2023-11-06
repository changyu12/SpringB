package com.example.jpa.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
		
		return "redirect:/";
	}
	
	@GetMapping("/readlist")
	public String readlist(Model model) {
		
		model.addAttribute("lists",userService.readlist());
		
		return "user/readlist";
	}
	
	@GetMapping("/readdetail")
	public String readdetail(Model model,@RequestParam Integer id) {
		model.addAttribute("list",userService.readdetail(id));
		return "user/readdetail";
	}
	
	@GetMapping("/update")
	public String update(Model model,@RequestParam Integer id) {
		model.addAttribute("list",userService.readdetail(id));
		return "user/update";
	}
	
	@PostMapping("/update")
	public String update(User user) {
		
		userService.update(user);
		
		return "user/readlist";
	}
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam Integer id) {
		userService.delete(id);
		
		
		return "user/readlist";
	}
	
}
