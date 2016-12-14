package com.xyz.blog.sys.common;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryParam {
	
	/**
	 * 每页多少条
	 */
	protected Integer pageSize;
	
	/**
	 * 当前页
	 */
	protected Integer pageNum;

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
	
	public int beginNum(int pageSize, int pageNum){
		pageNum = (pageNum==0)? 1: pageNum;
		return	(pageNum-1)*pageSize + pageSize;
	}
}
