package com.xyz.blog.usr.domain;

import com.xyz.blog.usr.domain.entity.User;

public interface UserDao {
	
	public User findUserByAccountAndPassword(User usr) throws Exception;
	
}
