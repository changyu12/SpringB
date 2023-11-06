package com.example.loginexam.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomerUserDetails implements UserDetails {
	
	private String cno, username, password, authority, cname, ctel, cdate;
	private int enabled;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		ArrayList<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();
		return authList;
	}

	@Override
	public String getPassword() {
		
		return password;
	}

	@Override
	public String getUsername() {
		
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}

	@Override		//락되어있지 않느냐?
	public boolean isAccountNonLocked() {
		
		return true;
	}

	@Override		//인증 받은것을 해제 안시킨다
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		return enabled==1?true:false;
	}

}
