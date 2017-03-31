package com.xyz.blog.usr.controller.bo;

import com.xyz.blog.sys.common.QueryParam;
import lombok.Data;

/**
 * Created by banma on 17/3/31.
 */
@Data
public class UserRoleMapBo extends QueryParam {

    private String roleId;

    private String userId;

}
