package com.xyz.blog.sys.controller;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.xyz.blog.sys.common.ControllerResult;
import com.xyz.blog.sys.service.LoginService;
import com.xyz.blog.usr.domain.entity.User;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	@ApiOperation(value = "跳转到登录页面", notes = "如果用户没有登录，就要跳转到登录页面")
	@RequestMapping(value = {"","/*"}, method = RequestMethod.GET)
	public String longin(){
		System.out.println("进到了登录界面");
		return "/login";
	}

	@ApiOperation(value="验证登录信息", notes = "传入User验证登录信息")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "account", value = "用户账号", required = true, dataType = "String"),
			@ApiImplicitParam(name = "password", value = "用户密码", required = true, dataType = "String")
	})
	@ResponseBody
	@RequestMapping(value="verify", method=RequestMethod.POST)
	public ControllerResult login(User usr){
		ControllerResult c = new ControllerResult();
		try {

			usr = loginService.login(usr);
			System.out.println(usr);
			if (usr == null) {
				c.setCode("402");
				c.setSuccess(-1);
				c.setMsg("用户名密码不正确");
			}

			List<User> list = new ArrayList<User>();
			list.add(usr);
			c.setRows(list);
		} catch (Exception e) {
			e.printStackTrace();
			c.setCode("400");
			c.setMsg("业务逻辑错误");
			c.setSuccess(-1);
		}
		return c;
	}
	
}
