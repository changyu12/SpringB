package com.example.cartexam.item;

import java.time.LocalDateTime;

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
	public String create(@RequestParam Integer id,
						 @RequestParam String productid, 
						 @RequestParam String name, 
						 @RequestParam double price	) {
		
		Item item = new Item();
		item.setProductid(productid);
		item.setName(name);
		item.setPrice(price);
		item.setCreatedate(LocalDateTime.now());
		
		itemService.create(item);
		
		return "redirect:/product/readdetail?id="+ id;
	}
	
	
}
