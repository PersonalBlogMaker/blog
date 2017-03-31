package com.xyz.blog.cms.domain.entity;

import java.io.Serializable;

import com.xyz.blog.sys.common.BaseEntity;
import com.xyz.blog.sys.common.QueryParam;
import lombok.Data;

@Data
public class Category extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 *  id
	 */
	private String id;

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
