package com.xyz.blog.usr.controller.bo;

import com.xyz.blog.sys.common.QueryParam;
import lombok.Data;

/**
 * Created by banma on 17/3/31.
 */
@Data
public class RoleBo extends QueryParam{

    private String name;

    private String parentId;


}
