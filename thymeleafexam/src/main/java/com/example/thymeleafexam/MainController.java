package com.example.thymeleafexam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	
	@GetMapping("/")
	public String  main(Model model) {
		
		// hello 라는 키 값으로 Hello world 문장을 가지고 뷰로 가기
		model.addAttribute("hello","Hello World");
		
		return "main";
	}
	
	@GetMapping("/main2")
	public String  main2(Model model) {
		

		model.addAttribute("hello","<b>Hello World</b>");
		
		return "main2";
	}
	
	
	
	/*
	 * @Autowired private Customer customer;
	 */
	
	@GetMapping("/main3")
	public String  main3(Customer customer,Model model) {
		
		/*Customer customer = new Customer();*/
		customer.setCno("1");
		customer.setCid("chandol");
		customer.setCpw("0000");
		customer.setCmail("chandol@naver.com");
		customer.setCaddr("서울시 종로구");
		
		model.addAttribute("cust", customer);
		
		return "main3";
	}
	
	@GetMapping("/main4")
	public String  main4(Model model) {
		
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy년 M월 d일 (E)");
		
		model.addAttribute("nowtime", now.format(formatter));
		
		return "main4";
	}
	
	@GetMapping("/form1")
	public String form1() {

		return "form1";
	}
	@PostMapping("/form1")
	public String form1(@RequestParam String cno,
						@RequestParam String cid,
						@RequestParam String cpw,
						@RequestParam String cmail,
						@RequestParam String caddr) {
		
		System.out.println(cno);
		System.out.println(cid);
		System.out.println(cpw);
		System.out.println(cmail);
		System.out.println(caddr);
		
		
		
		return "redirect:/form1";
	}
	
	@GetMapping("/form2")
	public String form2() {

		return "form2";
	}
	@PostMapping("/form2")
	public String form2(Customer customer) {
		
		System.out.println(customer.getCno());
		System.out.println(customer.getCid());
		System.out.println(customer.getCpw());
		System.out.println(customer.getCmail());
		System.out.println(customer.getCaddr());
		
		
		
		return "redirect:/form2";
	}
	
	@GetMapping("/image")
	public String image() {
		return "image";
	}
}
