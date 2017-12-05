package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginUserDetailsService implements UserDetailsService{
	@Autowired
	LoginUserRepository loginUserRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userid) throws UsernameNotFoundException{

		LoginUser loginUser = loginUserRepository.findOne(userid);
		if (loginUser == null) {
			throw new UsernameNotFoundException("該当するユーザが見つかりません");
		}
		return new LoginUserDetails(loginUser); 
	}
}