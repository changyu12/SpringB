package com.example.payexam.product;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface ProductService {

	
	
	List<Product> readlist();
	
	Product readdetail(Integer id);
	
	void update(Product product);
	
	void delete(Integer id);

	void create(Product product, MultipartFile file);
	
}
