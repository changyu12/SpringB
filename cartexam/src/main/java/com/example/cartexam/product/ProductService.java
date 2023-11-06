package com.example.cartexam.product;

import java.util.List;



public interface ProductService {

	
	
	List<Product> readlist();
	
	Product readdetail(Integer id);

	void create(Product product);
	
}
