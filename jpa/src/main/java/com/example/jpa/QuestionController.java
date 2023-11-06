package com.example.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@GetMapping("/create")
	public String create() {
		return "create";
	}

	@PostMapping("/create")
	public String create(Question question) {
		
		questionService.create(question);
		
		return "redirect:/";
	}
	
	@GetMapping("/readlist")
	public String readlist(Model model) {
		
		model.addAttribute("lists",questionService.readlist());
		
		return "readlist";
	}
	
	@GetMapping("/readdetail")
	public String readdetail(Model model,@RequestParam Integer id) {
		model.addAttribute("list",questionService.readdetail(id));
		return "readdetail";
	}
	
	@GetMapping("/update")
	public String update(Model model,@RequestParam Integer id) {
		model.addAttribute("list",questionService.readdetail(id));
		return "update";
	}
	
	@PostMapping("/update")
	public String update(Question question) {
		
		questionService.update(question);
		
		return "redirect:/readlist";
	}
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam Integer id) {
		questionService.delete(id);
		
		
		return "redirect:/readlist";
	}
	
}
