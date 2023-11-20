package com.example.payexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.payexam.product.ProductService;

@Controller
public class MainController {
	
	
	@Autowired
	private ProductService productService;

	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("lists",productService.readlist());
		
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
}
