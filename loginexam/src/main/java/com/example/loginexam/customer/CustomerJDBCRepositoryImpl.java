package com.example.loginexam.customer;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class CustomerJDBCRepositoryImpl implements CustomerRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void create(Map<String, Object> map) {
		String sql = "INSERT INTO customer (username, password, cname, ctel, cimg) "
					+ "VALUES(#{username}, #{password}, #{cname}, #{ctel}, #{cimg})";
		jdbcTemplate.update(sql,(String)map.get("username"),
								(String)map.get("password"),
								(String)map.get("cname"),
								(String)map.get("ctel"),
								(String)map.get("cimg"));
	}

	@Override
	public List<Customer> readlist() {
		String sql = "SELECT * FROM customer";
		
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Customer>(Customer.class));
	}

	@Override
	public Customer readdetail(String username) {
		String sql = "SELECT * FROM customer WHERE username = " + username;
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Customer>(Customer.class));
	}

	@Override
	public void update(Map<String, Object> map) {
		String sql = "UPDATE customer SET pasword= ?, cname= ?, ctel = ? ,cimage = ? WHERE username = ?";
		jdbcTemplate.update(sql,(String)map.get("password"),
								(String)map.get("cname"),
								(String)map.get("ctel"),
								(String)map.get("cimage"),
								(String)map.get("username")
								);
	

	}

	@Override
	public void delete(String username) {
		String sql = "DELETE FROM customer WHERE username = ? ";
		jdbcTemplate.update(sql, username);
	}

}
