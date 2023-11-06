package com.example.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/answer")
@Controller
public class AnswerController {
	
	@Autowired
	private AnswerService answerService;
	
	@GetMapping("/create")
	public String create() {
		return "/answer/create";
	}
	
	@PostMapping("/create")
	public String create(Answer answer) {
		
		answerService.create(answer);
		return "redirect:/";
	}
	
	@GetMapping("/readlist")
	public String readlist(Model model) {
		
		model.addAttribute("lists", answerService.readlist());
		
		return "/answer/readlist";
		
	}
	
	@GetMapping("/readdetail")
	public String readdetail(Model model, @RequestParam Integer id) {
		model.addAttribute("list", answerService.readdetail(id));
		return "/answer/readdetail";
		
	}
	
	@GetMapping("/update")
	public String update(Model model, @RequestParam Integer id) {
		model.addAttribute("list", answerService.readdetail(id));
		return "/answer/update";
	}
	
	@PostMapping("/update")
	public String update(Answer answer) {
		
		answerService.update(answer);
		return "redirect:/answer/readlist";
		
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam Integer id) {
		answerService.delete(id);
		
		return "redirect:/answer/readlist";
	}
}
