package com.xyz.blog.cms.domain.entity;

import java.io.Serializable;

import com.xyz.blog.sys.common.QueryParam;

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
	
	/**
	 * 删除标识
	 */
	private String active;
	private String createBy;
	private String createDate;
	private String updateBy;
	private String updateDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Integer getHits() {
		return hits;
	}
	public void setHits(Integer hits) {
		this.hits = hits;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	

}
