package com.xyz.blog.usr.domain.entity;

import java.io.Serializable;

import com.xyz.blog.sys.common.QueryParam;


public class User extends QueryParam implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private String account;
	
	private String userName;
	
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", account=" + account + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
}
