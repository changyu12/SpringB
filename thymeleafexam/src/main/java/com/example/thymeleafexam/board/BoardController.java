package com.example.thymeleafexam.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/board")
@Controller
public class BoardController {

	@GetMapping("/boardform")
	public String boardform() {
		return "board/boardform";
	}
	
	@PostMapping("/boardform")
	public String boardform(Board board, Model model) {
		
		model.addAttribute("board", board);
		
		return "board/boardview";
	}
	
	
}