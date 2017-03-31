package com.xyz.blog.sys.common;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryParam extends BaseEntity{
	
	/**
	 * 每页多少条
	 */
	protected Integer pageSize;
	
	/**
	 * 当前页
	 */
	protected Integer pageNum;
	
	/**
	 * 开始index
	 */
	protected Long start;

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	
	public Long getStart() {
		return start;
	}

	public void setStart(Long start) {
		this.start = this.beginNum(pageSize, pageNum);
	}

	public Long beginNum(int pageSize, int pageNum){
		pageNum = (pageNum==0)? 1: pageNum;
		return	(long) ((pageNum-1)*pageSize + pageSize);
	}
}
