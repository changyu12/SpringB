package com.example.y.board;

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





	@RequestMapping("/board")
	@Controller
	public class BoardController {
		
		@Autowired
		private BoardService boardService;
		
		@GetMapping("/create")
		public String create() {
			return "board/create";
		}
		
		@PostMapping("/create")
		public String create(@RequestParam Map<String, Object> map,@RequestParam MultipartFile bimg
							) {

			boardService.create(map, bimg);
			
			
			return "redirect:/login";
		}
		
		
		
		
		
		@GetMapping("/readlist")
		public String readlist(Model model) {
			
			model.addAttribute("boards", boardService.readlist());
			
			return "board/readlist";
		}
		
		@GetMapping("/readdetail")
		public String readdetail(Model model, @RequestParam ("bno") String bno) {
			
			model.addAttribute("board", boardService.readdetail(bno));
			
			return "board/readdetail";
		}
		
		
		@GetMapping("/delete")
		public String delete(@RequestParam ("bno") String bno) {
			
			boardService.delete(bno);
			
			return "redirect:/readlist";
		}
		
		
		@GetMapping("/update")
		public String update(Model model, @RequestParam ("bno") String bno) {
			
			model.addAttribute("board", boardService.readdetail(bno));

			return "board/update";
		}
		
		@PostMapping("/update")
		public String update(@RequestParam Map<String, Object> map) {

			
			boardService.update(map);
			
			return "redirect:/readlist";
		}
		
	}

