package com.example.cartexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.cartexam.product.ProductService;



@Controller
public class MainController {

	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/")
	public String index() {
		
		
		
		return "index";
	}
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	
	
	
}
