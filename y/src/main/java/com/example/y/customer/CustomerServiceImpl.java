package com.example.y.customer;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public void create(Map<String, Object> map , MultipartFile file) {
		//파일 이름 UUID 처리 
				String timg = file.getOriginalFilename();
				String cimg = UUID.randomUUID().toString() + "_"+ timg;
		//파일 전송
		String FTP_ADDRESS = "chandool.cafe24.com";
		String LOGIN = "chandool";
		String PSW = "rb123123!";
		
		FTPClient con = null;
		
		try {
			con = new FTPClient();
			con.connect(FTP_ADDRESS);
			
			if(con.login(LOGIN, PSW)) {
				con.enterLocalPassiveMode();
				con.setFileType(FTP.BINARY_FILE_TYPE);
				con.storeFile(cimg, file.getInputStream());
				con.logout();
				con.disconnect();
				System.out.println("success!!!");
			}
		} catch (Exception e) {
			System.out.println("fail!!!");
		}
		
		
		
		map.put("cimg",cimg);
		
		
		String password = (String) map.get("password");
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		map.put("password", passwordEncoder.encode(password));
		
		customerRepository.create(map);
	}

	@Override
	public List<Customer> readlist() {
		return customerRepository.readlist();
	}

	@Override
	public Customer readdetail(String username) {
		
		return customerRepository.readdetail(username);
	}

	@Override
	public void update(Map<String, Object> map) {
		customerRepository.update(map);

	}

	@Override
	public void delete(String username) {
		customerRepository.delete(username);
	}
}