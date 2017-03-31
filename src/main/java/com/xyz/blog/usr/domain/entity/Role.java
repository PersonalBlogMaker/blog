package com.xyz.blog.usr.domain.entity;

import com.xyz.blog.sys.common.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by banma on 17/3/31.
 */
@Data
public class Role extends BaseEntity implements Serializable{

    private String name;

    private String parentId;

}
