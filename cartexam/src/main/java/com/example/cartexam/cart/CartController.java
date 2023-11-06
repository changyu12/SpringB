package com.example.cartexam.cart;





import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.cartexam.item.ItemService;

import com.example.cartexam.user.UserService;




@RequestMapping("/cart")
@Controller
public class CartController {

	@Autowired
	private CartService cartService;
	
	@Autowired
	private ItemService itemService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/readdetail")
	public String readdetail(Model model) {

		Cart cart = cartService.readdetailusername();
				
		model.addAttribute("user", userService.readdetailusername());
		model.addAttribute("list", cartService.readdetailusername());
		model.addAttribute("total", itemService.findTotalAmount(cart));
		
		return "cart/readdetail";
	}
	
	@GetMapping("/payment")
	public String payment(@RequestParam("imp_uid") String imp_uid) {
		
		System.out.println(imp_uid);
		
		deliveryService.create(imp_uid);
		
		return "";
	}
}
