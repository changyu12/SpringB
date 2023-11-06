package com.example.thymeleafexam2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("hello","Hello World!!! 환영");
		model.addAttribute("hello2","<h4>Hello World!!환영</h4>");
		return "index";
	}
	
	
}
