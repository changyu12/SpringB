package com.example.cartexam.product;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {

	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void create(Product product) {
		
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



	

}
