package com.example.s3demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.util.IOUtils;

@Controller
public class S3Controller {

	@Autowired
	private S3Service s3Service;
	
	@GetMapping("/")
	public String index() {
		return "upload";
	}
	
	@PostMapping("/")
	public String upload(S3 s3,@RequestParam("file") MultipartFile file) throws IOException {
		s3Service.uploadFile(s3,file);
		
		return "redirect:/";
	}
	
	
	/*
	 * // S3Controller.java
	 * 
	 * @GetMapping("/download") public ResponseEntity<InputStreamResource>
	 * downloadFile() throws IOException { S3Object s3Object =
	 * s3Service.downloadFile("1700015299585_y.png"); S3ObjectInputStream
	 * objectInputStream = s3Object.getObjectContent(); InputStreamResource
	 * inputStreamResource = new InputStreamResource(objectInputStream);
	 * 
	 * HttpHeaders headers = new HttpHeaders(); headers.add("Content-Disposition",
	 * String.format("attachment; filename=\"%s\"", "1700015299585_y.png"));
	 * headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
	 * headers.add("Pragma", "no-cache"); headers.add("Expires", "0");
	 * 
	 * ResponseEntity<InputStreamResource> responseEntity =
	 * ResponseEntity.ok().headers(headers)
	 * .contentLength(s3Object.getObjectMetadata().getContentLength())
	 * .contentType(MediaType.parseMediaType("application/octet-stream"))
	 * .body(inputStreamResource);
	 * 
	 * return responseEntity; }
	 */
	 
	
	// S3Controller.java
	
	
	  @GetMapping("/download")
	  public ResponseEntity<byte[]> displayImage(@PathVariable String fileName) throws IOException {
	      S3Object s3Object = s3Service.downloadFile(fileName);
	      S3ObjectInputStream inputStream = s3Object.getObjectContent();
	      byte[] bytes = IOUtils.toByteArray(inputStream);
	      
	      HttpHeaders httpHeaders = new HttpHeaders();
	      httpHeaders.setContentType(MediaType.IMAGE_PNG);

	      return new ResponseEntity<>(bytes, httpHeaders, HttpStatus.OK);
	  }
	
	  @GetMapping("/readlist")
	  public String readlist(Model model) {
		  model.addAttribute("lists", s3Service.readlist());
		  
		  return "readlist";
		  
	  }
	  
	  @GetMapping("/readdetail")
	  public String readdetail(Model model, Integer sid) {
		  model.addAttribute("list", s3Service.readdetail(sid));
		  
		  return "readdetail";
	  }
	  
	  
	  
	  
	  @GetMapping("/view")
	  public String view() {
		  return "veiw";
	  }
}
