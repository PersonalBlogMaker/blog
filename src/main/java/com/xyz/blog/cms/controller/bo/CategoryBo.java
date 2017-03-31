package com.xyz.blog.cms.controller.bo;

import com.xyz.blog.sys.common.QueryParam;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by banma on 17/3/31.
 */
@Data
public class CategoryBo extends QueryParam implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 父级栏目ID
     */
    private String parentId;


    /**
     *  名称
     */
    private String name;

    /**
     * 	 描述
     */
    private String description;

}
