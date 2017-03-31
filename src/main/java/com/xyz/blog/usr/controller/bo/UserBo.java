package com.xyz.blog.usr.controller.bo;

import com.xyz.blog.sys.common.QueryParam;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by banma on 17/3/31.
 */
@Data
public class UserBo extends QueryParam implements Serializable{

    private static final long serialVersionUID = 1L;

    private String account;

    private String userName;

    private String password;

    private String role;

}
