package com.example.loginexam.customer;

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

@RequestMapping("/customer")
@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/create")
	public String create() {
		return "customer/create";
	}
	
	@PostMapping("/create")
	public String create(@RequestParam Map<String, Object> map,@RequestParam MultipartFile file
						) {

		
	
		
		
		
		
		customerService.create(map, file);
		
		
		return "redirect:/";
	}
	
	
	
	
	
	@GetMapping("/readlist")
	public String readlist(Model model) {
		
		model.addAttribute("customers", customerService.readlist());
		
		return "readlist";
	}
	
	@GetMapping("/readdetail")
	public String readdetail(Model model, @RequestParam ("username") String username) {
		
		model.addAttribute("customer", customerService.readdetail(username));
		
		return "readdetail";
	}
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam ("username") String username) {
		
		customerService.delete(username);
		
		return "redirect:/readlist";
	}
	
	
	@GetMapping("/update")
	public String update(Model model, @RequestParam ("username") String username) {
		
		model.addAttribute("customer", customerService.readdetail(username));

		return "update";
	}
	
	@PostMapping("/update")
	public String update(@RequestParam Map<String, Object> map) {

		
		customerService.update(map);
		
		return "redirect:/readlist";
	}
	
	
	
	

	
	@PostMapping("/form")
	public String filepost(@RequestParam("title") String title,
						   @RequestParam("filename") MultipartFile file) 
				throws IllegalStateException, IOException
			{
		String filename = file.getOriginalFilename();
		File f = new File("c:\\upload\\" +filename);
		
		file.transferTo(f);
		
		return "success";
	}
	
	@GetMapping("/formcdn")
	public String fileformcdn() {
		return "formcdn";
	}
	
	@PostMapping("/formcdn")
	public String filepostcdn(@RequestParam("title") String title,
						   @RequestParam("filename") MultipartFile file) 
			{
		
		String FTP_ADDRESS = "iup.cdn1.cafe24.com";
		String LOGIN = "d121034";
		String PSW = "ajfxlvmf00@";
		
		FTPClient con = null;
		
		try {
			con = new FTPClient();
			con.connect(FTP_ADDRESS);
			
			if(con.login(LOGIN, PSW)) {
				con.enterLocalPassiveMode();
				con.setFileType(FTP.BINARY_FILE_TYPE);
				con.storeFile(file.getOriginalFilename(), file.getInputStream());
				con.logout();
				con.disconnect();
				System.out.println("success!!!");
			}
		} catch (Exception e) {
			System.out.println("fail!!!");
		}
		
		
		return "success";
				
	}
	
}