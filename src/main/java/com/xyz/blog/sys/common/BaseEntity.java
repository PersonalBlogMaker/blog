package com.xyz.blog.sys.common;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by banma on 17/3/31.
 */
@Data
public class BaseEntity implements Serializable{

    private String id;

    /**
     * 删除标识
     */
    private String active;
    private String createBy;
    private String createDate;
    private String updateBy;
    private String updateDate;
}
