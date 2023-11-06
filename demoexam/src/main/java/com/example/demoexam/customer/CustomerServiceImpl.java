package com.example.demoexam.customer;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	
	@Override
	public void create(Map<String, Object> map) {
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
