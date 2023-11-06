package com.example.boot3mybatis.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetail implements UserDetails {

   private String uno, username, password, authority, uname, udate;

   private boolean enabled;
   
   @Override
   public Collection<? extends GrantedAuthority> getAuthorities() {
      ArrayList<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();
      return authList;
   }

   @Override
   public String getPassword() {
      // TODO Auto-generated method stub
      return password;
   }

   @Override
   public String getUsername() {
      // TODO Auto-generated method stub
      return username;
   }

   @Override
   public boolean isAccountNonExpired() {
      // TODO Auto-generated method stub
      return true;
   }

   @Override
   public boolean isAccountNonLocked() {
      // TODO Auto-generated method stub
      return true;
   }

   @Override
   public boolean isCredentialsNonExpired() {
      // TODO Auto-generated method stub
      return true;
   }

   @Override
   public boolean isEnabled() {
      return enabled;
   }

}