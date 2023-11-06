package com.example.jpatest.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/customer")
@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@GetMapping("/create")
	public String create() {
		return "customer/create";
	}
	
	@PostMapping("/create")
	public String create(Customer customer) {
		
		customerService.create(customer);
		
		return "redirect:/";
	}
	
}