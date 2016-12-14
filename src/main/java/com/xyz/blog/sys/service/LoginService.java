package com.xyz.blog.sys.service;

import com.xyz.blog.usr.domain.entity.User;

public interface LoginService {
	
	public User login(User usr) throws Exception; 

}
