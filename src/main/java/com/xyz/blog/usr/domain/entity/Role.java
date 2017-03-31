package com.xyz.blog.usr.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by banma on 17/3/31.
 */
@Data
public class Role implements Serializable{

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
