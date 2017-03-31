package com.xyz.blog.usr.domain.entity;

import java.io.Serializable;

import com.xyz.blog.sys.common.QueryParam;
import lombok.Data;

@Data
public class User extends QueryParam implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String account;
	
	private String userName;
	
	private String password;

}
