package com.example.payexam.cart;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/cart")
@Controller
public class CartController {
	
	@Autowired
	private CartService cartService;

	@GetMapping("/readdetail")
	public String readdetail(Model model, Principal principal) {
		
		model.addAttribute("lists", cartService.readdetail(principal.getName()));
		
		return "cart/readdetail";
	}


}
