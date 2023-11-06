package com.example.notiexam.notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.notiexam.user.User;
import com.example.notiexam.user.UserService;

@RequestMapping("/notice")
@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@Autowired
	private UserService userService;

	@GetMapping("/create")
	public String create() {
		return "notice/create";
	}
	
	
	@PostMapping("/create")
	public String create(Notice notice) {
		
		noticeService.create(notice);
		
		return "redirect:/notice/readlist";
	}
	
//	@GetMapping("/readlist")
//	public String readlist(Model model) {
//		
//		model.addAttribute("notices", noticeService.readlist());
//		
//		return "notice/readlist";
//	}
//	
	@GetMapping("/readlist")
	public String readlist(Model model, 
			 @RequestParam(value="page", defaultValue="0") int page) {
		
		Page<Notice> paging = noticeService.getList(page);
		model.addAttribute("paging", paging);
		
		return "notice/readlist";
	}
	
	
	
	
	@GetMapping("/readdetail")
	public String readdetail(Model model, 
							 @RequestParam Integer id) {
		
		Notice notice = noticeService.readdetail(id);
		User user = userService.readdetailusername();
		noticeService.hit(notice, user);
		
		model.addAttribute("notice", noticeService.readdetail(id));
		
		return "notice/readdetail";
	}
	
	@GetMapping("/update")
	public String update(Model model, 
						 @RequestParam Integer id) {

		model.addAttribute("notice", noticeService.readdetail(id));

		return "notice/update";
	}
	
	
	@PostMapping("/update")
	public String update(Notice notice) {
		
		noticeService.update(notice);
		
		return "redirect:/notice/readlist";
	}
	
	@PreAuthorize("isAuthenticated()")
	@GetMapping("/vote")
	public String noticeVote(@RequestParam Integer id) {
		
		Notice notice = noticeService.readdetail(id);
		User user = userService.readdetailusername();
		noticeService.vote(notice, user);
		
		return "redirect:/notice/readdetail?id=" + id;
	}
	
	@PreAuthorize("isAuthenticated()")
	@GetMapping("/hate")
	public String noticeHate(@RequestParam Integer id) {
		
		Notice notice = noticeService.readdetail(id);
		User user = userService.readdetailusername();
		noticeService.hate(notice, user);
		
		return "redirect:/notice/readdetail?id=" + id;
	}
	
	
}
