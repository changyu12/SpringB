package com.example.demoexam;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;

	@GetMapping("/create")
	public String create(){
		
		return "create";
	}
	
	@PostMapping("/create")
	public String create(@RequestParam Map<String, Object> map){
			System.out.println((String)map.get("title"));
			System.out.println((String)map.get("content"));
			System.out.println((String)map.get("writer"));
			
			boardService.create(map);
			
		return "redirect:/";
	}
	
	@GetMapping("/readlist")
	public String readlist(Model model){
		
		model.addAttribute("board", boardService.readlist());
		
		return "readlist";
	}
	
	@GetMapping("/readdetail")
	public String readdetail(Model model, @RequestParam ("bno") String bno){
		
		model.addAttribute("board", boardService.readdetail(bno));
		

		
		return "readdetail";
	}
	
	@GetMapping("/update")
	public String update(Model model, @RequestParam ("bno") String bno) {
		
		model.addAttribute("board", boardService.readdetail(bno));

		return "update";
	}
	
	@PostMapping("/update")
	public String update(@RequestParam Map<String, Object> map) {
		
		System.out.println((String) map.get("btitle"));
		System.out.println((String) map.get("bcontent"));
		System.out.println((String) map.get("bwriter"));
		
		boardService.update(map);
		
		return "redirect:/readlist";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam ("bno") String bno) {
		
		boardService.delete(bno);
		
		return "redirect:/readlist";
	}
}
