package com.example;

import com.example.demo.LoginUser;
import lombok.Data;

@SuppressWarnings("serial")
@Data
public class LoginUserDetails extends org.springframework.security.core.userdetails.User{
	private final LoginUser loginUser;
	
	public LoginUserDetails(LoginUser loginUser) {
		super(loginUser.getUserid(), loginUser.getPassword(), loginUser.getAuth());
		this.loginUser = loginUser;
	}

	public LoginUser getLoginUser() {
		return loginUser;
	}
}
