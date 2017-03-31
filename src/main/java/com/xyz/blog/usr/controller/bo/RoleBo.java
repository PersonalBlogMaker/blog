package com.xyz.blog.usr.controller.bo;

import com.xyz.blog.sys.common.QueryParam;

/**
 * Created by banma on 17/3/31.
 */
public class RoleBo extends QueryParam{
    private String id;

    private String name;

    private String parentId;

    /**
     * 删除标识
     */
    private String active;
    private String createBy;
    private String createDate;
    private String updateBy;
    private String updateDate;
}
