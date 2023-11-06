package com.example.resumeexam.reply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.resumeexam.board.Board;
import com.example.resumeexam.board.BoardService;

import jakarta.validation.Valid;


@RequestMapping("/reply")
@Controller
public class ReplyController {

	@Autowired
	private BoardService boardService;
	
	@Autowired
	private ReplyService replyService;
	
	/*
	 * @PostMapping("/create") public String create(@RequestParam Integer id,
	 * 
	 * @RequestParam String content) {
	 * 
	 * 
	 * replyService.create(id, content);
	 * 
	 * return "redirect:/board/readlist";
	 * 
	 * }
	 */
	
	@PostMapping("/create")
	public String create(Model model, @Valid ReplyForm replyForm, 
						  BindingResult bindingResult,
						 @RequestParam Integer id) {
		
		if (bindingResult.hasErrors()) {
			
			model.addAttribute("list", boardService.readdetail(id));
			
			return "board/readdetail";
		}
		
		
		replyService.create(id, replyForm.getContent());
		
		return "redirect:/board/readdetail?id="+id;
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam Integer id) {
		replyService.delete(id);

		
		return "redirect:/board/readdetail?id="+id;
	}
}
