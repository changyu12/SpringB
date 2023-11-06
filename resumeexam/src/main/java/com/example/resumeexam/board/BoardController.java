package com.example.resumeexam.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.resumeexam.reply.ReplyForm;

import jakarta.validation.Valid;



@RequestMapping("/board")
@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/create")
	public String create(BoardForm boardForm) {
		
		return "board/create";
	} 
	/*
	 * @PostMapping("/create") public String create(Board board) {
	 * boardService.create(board); return "redirect:/board/readlist"; }
	 */
	
	
	//validation 적용 버전
	@PostMapping("/create")
	public String create(@Valid BoardForm boardForm, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "board/create";
		}
		
		boardService.create(boardForm.getSubject(), boardForm.getContent());
		
		return "redirect:/board/readlist";
	}
	
	@GetMapping("/readlist")
	public String readlist(Model model, @RequestParam(value="page", defaultValue="0") int page) {
		
		Page<Board> paging = boardService.findAll(page);
		
		//model.addAttribute("lists", boardService.readlist());
		model.addAttribute("paging", paging);
		
		return "board/readlist";
	}
	
	@GetMapping("/readdetail")
	public String readdetail(Model model,@RequestParam Integer id, ReplyForm replyForm) {
		model.addAttribute("list",boardService.readdetail(id));
		return "board/readdetail";
	}
	
	@GetMapping("/update")
	public String update(Model model, @RequestParam Integer id, BoardForm boardform) {
		model.addAttribute("list",boardService.readdetail(id));
		
		return "board/update";
	}
	
	@PostMapping("/update")
	public String update(Model model,@RequestParam Integer id, 
						@Valid BoardForm boardForm, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("list",boardService.readdetail(id));
			return "board/update";
		}
		
		boardService.update(boardForm.getSubject(), boardForm.getContent(),id);
		
		return "redirect:/board/readdetail?id="+id;
	}
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam Integer id) {
		boardService.delete(id);
		
		
		return "redirect:/board/readlist";
	}
	
}
