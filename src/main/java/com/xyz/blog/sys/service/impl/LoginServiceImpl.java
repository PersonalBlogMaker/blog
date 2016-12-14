package com.xyz.blog.sys.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xyz.blog.sys.service.LoginService;
import com.xyz.blog.usr.domain.UserDao;
import com.xyz.blog.usr.domain.entity.User;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Resource(name="userDao")
	private UserDao userDao;
	
	public User login(User usr) throws Exception {
		return userDao.findUserByAccountAndPassword(usr);
	}
	
}
