package com.example.boot3mybatis.auth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.stereotype.Service;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Service
public class UserDetailService implements UserDetailsService {

   @Autowired
   private UserDetailRepository UserDetailRepository;
   
   @Override
   public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      
   

      
      UserDetails user = UserDetailRepository.getUserById(username);
      
      if(user == null) {
         throw new UsernameNotFoundException("username" + username + " not found");
      }
      
      return user;
      

   }
   
   @Autowired
   HttpServletRequest req;
   
     public int logincheck( String username) {
        UserDetail user = UserDetailRepository.getUserById(username);
        
        if(user != null) {
           // 디비에 존재하는 회원이기 때문에 스프링 시큐리티 규격에 맞게 세션 처리
           
           List<GrantedAuthority> list =new ArrayList<GrantedAuthority>();
           list.add(new SimpleGrantedAuthority("ROLE_USER"));
           
           SecurityContext sc =SecurityContextHolder.getContext();
           sc.setAuthentication(new UsernamePasswordAuthenticationToken(user,null,list));
           
           
           HttpSession session =req.getSession(true);
           
            session.setAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY,sc);

           return 1;
        }else {
           return 0;
        }
   }

}