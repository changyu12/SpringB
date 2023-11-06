package com.example.boot3mybatis.notice;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("/notice")
@Controller
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("/create")
	public String create() {
		
		
		return "notice/create";
	}
	
	@PostMapping("/create")
	public String create(Notice notice,	 @RequestParam("file")MultipartFile file) {
		noticeService.create(notice, file);
		
		return "redirect:/";
	}
	
	@GetMapping("/readlist")
	public String readlist(Model model) {
		
		
		List<Notice> notices = noticeService.readlist();
		
		model.addAttribute("notices", notices);
		
		return "notice/readlist";
	}
	
	@GetMapping("/readdetail")
	public String readdetail(Model model,
							 @RequestParam String nid) {
		
		Notice notice = noticeService.readdetail(nid);
		
		model.addAttribute("notice", notice);
		
		return "notice/readdetail";
	}
	
	@GetMapping("/update")
	public String update(Model model,@RequestParam String nid) {
		
		
		
		
		
		 model.addAttribute("notice",noticeService.readdetail(nid));
		
		return "notice/update";
	}
	
	@PostMapping("/update")
	public String update(Notice notice,MultipartFile file) {
		
		noticeService.update(notice,file);
		
		return "redirect:/notice/readlist";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam ("nid") String nid) {
		
		noticeService.delete(nid);
		
		return "redirect:/notice/readlist";
	}
	
}
