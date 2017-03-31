package com.xyz.blog.cms.domain.entity;

import java.io.Serializable;

import com.xyz.blog.sys.common.QueryParam;
import lombok.Data;

@Data
public class Article extends QueryParam implements Serializable{
		
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	private String id;
	
	/**
	 * 内容
	 */
	private String content;
	
	/**
	 * 文章标题
	 */
	private String title;
	
	/**
	 * 关键字
	 */
	private String keywords;
	
	/**
	 * 描述
	 */
	private String description;
	
	/**
	 * 权重
	 */
	private Integer weight;
	
	//private String weight_date;
	
	/**
	 * 点击量
	 */
	private Integer hits;
	
	/**
	 * 摘要
	 */
	private String remark;
	
	/**
	 * 类别id
	 */
	private String categoryId;

}
