package com.example.payexam.product;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ProductServiceImpl implements ProductService {

	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void create(Product product, MultipartFile file) {
		
		
		String uuid = UUID.randomUUID().toString();
		
		String filename = uuid + "_" + file.getOriginalFilename();
		
		
		String FTP_ADDRESS = "iup.cdn1.cafe24.com";
		String LOGIN = "awesomeclass";
		String PSW = "guest0505";
		
		FTPClient con = null;
		
		try {
			con = new FTPClient();
			con.connect(FTP_ADDRESS);
			
			if(con.login(LOGIN, PSW)) {
				con.enterLocalPassiveMode();
				con.setFileType(FTP.BINARY_FILE_TYPE);
				con.storeFile(filename, file.getInputStream());
				con.logout();
				con.disconnect();
				System.out.println("success!!!");
			}
		} catch (Exception e) {
			System.out.println("fail!!!");
		}
		
		
		product.setImgname(filename);
		product.setCreateDate(LocalDateTime.now());
		
		productRepository.save(product);
	}

	@Override
	public List<Product> readlist() {
		
		return productRepository.findAll();
	}

	@Override
	public Product readdetail(Integer id) {
		
		Optional<Product> op = productRepository.findById(id);
		Product product = op.get();
		
		return product;
	}

	@Override
	public void update(Product product) {
		
		productRepository.save(product);

	}

	@Override
	public void delete(Integer id) {
		Optional<Product> op = productRepository.findById(id);
		Product product = op.get();
		
		productRepository.delete(product);
	}

}
