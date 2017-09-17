package com.global.hb;

import javax.persistence.*;


@Entity
@Table(name="admin_login")
public class AdminLogin {
	
	@Id
	private int id;
	
	@Column(name="userid")
	private String userid;
	
	@Column(name="password")
	private String password;
	
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
