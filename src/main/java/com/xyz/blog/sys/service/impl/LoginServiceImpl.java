package com.xyz.blog.sys.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xyz.blog.sys.common.SessionManager;
import com.xyz.blog.sys.service.LoginService;
import com.xyz.blog.usr.domain.UserDao;
import com.xyz.blog.usr.domain.entity.User;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Resource(name="userDao")
	private UserDao userDao;
	
	public User login(User usr) throws Exception {
		usr = userDao.findUserByAccountAndPassword(usr);
		//如果查询出用户，则登录成功，并保存在。
		if(usr!=null){
			SessionManager.getUserSession().setAttribute("UserSession", SessionManager.getUserSession());
			SessionManager.getUserSession().setAttribute("User", usr);
		}
		return usr;
	}
	
}
