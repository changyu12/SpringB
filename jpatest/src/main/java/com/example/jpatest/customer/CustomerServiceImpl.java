package com.example.jpatest.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	
	//create
		@Override
		public void create(Customer customer) {
			
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			
			customer.setPassword(passwordEncoder.encode(customer.getPassword()));
			customerRepository.save(customer);
		}


	@Override
	public List<Customer> readlist() {
		
		return customerRepository.findAll();
	}


	@Override
	public Customer readdetail(Integer id) {
		Optional<Customer> oq = customerRepository.findById(id);
		Customer q = oq.get();
		return q;
	}


	@Override
	public void update(Customer customer) {
		Integer id = customer.getId();
		String username = customer.getUsername();
		String password = customer.getPassword();
		
		Optional<Customer> oq = customerRepository.findById(id);
		Customer q = oq.get();
		
		q.setUsername(username);
		q.setPassword(password);
		customerRepository.save(q);
		
	}


	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
