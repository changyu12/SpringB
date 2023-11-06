package com.example.cartexam.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("/product")
@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@GetMapping("/create")
	public String create() {
		return "product/create";
	}
	
	@PostMapping("/create")
	public String create(Product product
						) {
								
		productService.create(product);
		return "product/create";
	}
	
	@GetMapping("/readlist")
	public String readlist(Model model) {
		
		model.addAttribute("lists", productService.readlist());
		
		return "product/readlist";
	}
	
	@GetMapping("/readdetail")
	public String readdetail(Model model,@RequestParam("id") Integer id) {
		
		model.addAttribute("list", productService.readdetail(id));
		
		return "product/readdetail";
	}
	
}
