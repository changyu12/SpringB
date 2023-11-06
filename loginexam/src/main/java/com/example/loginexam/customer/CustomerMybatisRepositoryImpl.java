package com.example.loginexam.customer;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class CustomerMybatisRepositoryImpl implements CustomerRepository {

    @Autowired
      private SqlSessionTemplate sqlSessionTemplate;

      @Override
      public void create(Map<String, Object> map) {
         
         String password = (String) map.get("password");
          
         sqlSessionTemplate.insert("customer.create", map);

      }

      @Override
      public void update(Map<String, Object> map) {
         sqlSessionTemplate.update("customer.update",map);

      }

      @Override
      public void delete(String username) {
         sqlSessionTemplate.delete("customer.delete", username);

      }

	@Override
	public List<Customer> readlist() {
		
		return sqlSessionTemplate.selectList("customer.readlist");
	}

	@Override
	public Customer readdetail(String username) {
		  return sqlSessionTemplate.selectOne("customer.readdetail",username);
	}

   }