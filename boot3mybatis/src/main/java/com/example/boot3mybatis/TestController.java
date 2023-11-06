package com.example.boot3mybatis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/test")
@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1() {
		return "/test/test1";
	}
}
