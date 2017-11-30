package com.csigroup.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service("customUserDetailsService")
public class UserCredential  implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return new User("username","password", getGrantedAuthorities("username"));
	}
	
	private List<org.springframework.security.core.GrantedAuthority> getGrantedAuthorities(String username){
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		return authorities;
	}
	

}
