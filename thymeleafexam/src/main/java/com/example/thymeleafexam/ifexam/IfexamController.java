package com.example.thymeleafexam.ifexam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.thymeleafexam.Customer;

@RequestMapping("/ifexam")
@Controller
public class IfexamController {
	
	@GetMapping("/ifexam1")
	public String ifexam1(Model model) {
		Customer customer = new Customer();
		
		
		customer.setCmail("cksrb5512@hanmail.net");
		
		model.addAttribute(customer);
		return "ifexam/ifexam1";
	}
	
	@GetMapping("/ifexam2")
	public String ifexam2(Model model) {
		Customer customer = new Customer();
		
		
		customer.setCarmy(false);
		
		model.addAttribute(customer);
		
		return "ifexam/ifexam2";
	}
	
	@GetMapping("/switchexam1")
	public String switchexam1(Model model) {
			
		Customer customer = new Customer();
		
		customer.setCno("1");
		
		model.addAttribute(customer);
		
		return "ifexam/switchexam1";
	}
}
