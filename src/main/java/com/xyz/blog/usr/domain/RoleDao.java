package com.xyz.blog.usr.domain;

import com.xyz.blog.sys.domain.CudDao;
import com.xyz.blog.sys.domain.ReadDao;
import com.xyz.blog.usr.controller.bo.RoleBo;
import com.xyz.blog.usr.domain.entity.Role;

/**
 * Created by banma on 17/3/31.
 */
public interface RoleDao extends CudDao<Role>, ReadDao<RoleBo> {


}
