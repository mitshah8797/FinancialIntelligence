package com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LoginTable")

public class LoginVO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loginId;
	
	@Column(name="Email", unique=true)
	private String emailId;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="Role")
	private String role;
	
	@Column(name="Enabled")
	private String enabled;
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public LoginVO() {
		// TODO Auto-generated constructor stub
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
}
