package com.example.boot3mybatis.auth;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDetailRepository {

   @Autowired
   private SqlSessionTemplate sqlSessionTemplate;
   
   
   
   public UserDetail getUserById(String username) {
      
   
      
   UserDetail user = sqlSessionTemplate.selectOne("user.getUserById", username);

   
   return user;
   }
}
