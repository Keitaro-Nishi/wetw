package com.example;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name="userdata")
//@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class LoginUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String userid;

	private String password;

	private Collection<? extends GrantedAuthority> auth;


	
	public LoginUser() {
	}
	
	public LoginUser(String userid, String password, Collection<? extends GrantedAuthority> auth) {
        this.userid = userid;
        this.password = password;
        this.auth = auth;
    }

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Collection<? extends GrantedAuthority> getAuth() {
		return this.auth;
	}

	public void setAuth(Collection<? extends GrantedAuthority> auth) {
		this.auth = auth;
	}
}