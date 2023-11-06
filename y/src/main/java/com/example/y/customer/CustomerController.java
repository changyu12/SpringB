package com.example.y.customer;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;





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
		public String create(@RequestParam Map<String, Object> map,@RequestParam MultipartFile cimg
							) {

			customerService.create(map, cimg);
			
			
			return "redirect:/login";
		}
		
		
		
		
		
		@GetMapping("/readlist")
		public String readlist(Model model) {
			
			model.addAttribute("customers", customerService.readlist());
			
			return "customer/readlist";
		}
		
		@GetMapping("/readdetail")
		public String readdetail(Model model, @RequestParam ("username") String username) {
			
			model.addAttribute("customer", customerService.readdetail(username));
			
			return "customer/readdetail";
		}
		
		
		@GetMapping("/delete")
		public String delete(@RequestParam ("username") String username) {
			
			customerService.delete(username);
			
			return "redirect:/readlist";
		}
		
		
		@GetMapping("/update")
		public String update(Model model, @RequestParam ("username") String username) {
			
			model.addAttribute("customer", customerService.readdetail(username));

			return "customer/update";
		}
		
		@PostMapping("/update")
		public String update(@RequestParam Map<String, Object> map) {

			
			customerService.update(map);
			
			return "redirect:/readlist";
		}
		
	}

