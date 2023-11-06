package com.example.payexam.cart.item;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/item")
@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@PostMapping("/create")
	public String create(Principal principal,
						 @RequestParam String name,
						 @RequestParam double price,
						 @RequestParam String productid,
						 @RequestParam int number
			) {
		Item item = new Item();
		item.setName(name);
		item.setPrice(price);
		item.setProductid(productid);
		item.setNumber(number);
		
		itemService.create(item);
		
		return "cart/readdetail?username=" + principal.getName();
	}
}
