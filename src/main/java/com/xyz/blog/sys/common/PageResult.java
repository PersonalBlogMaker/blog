package com.xyz.blog.sys.common;

import java.util.List;

public class PageResult<T> extends QueryParam{
	
	/**
	 * 结果集
	 */
	private List<T> result = null;
	
	/**
	 * 总记录数
	 */
	private long totalElements = 0;
	
	/**
	 * 总页数
	 */
	private long  totalLength;
	
	/**
	 * 是否第一页
	 */
	private boolean first;
	
	/**
	 * 是否最后一页
	 */
	private boolean last;

	public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}

	public long getTotalLength() {
		return (getTotalElements()-1) / pageSize + 1;
	}

	public void setTotalLength(long totalLength) {
		this.totalLength = totalLength;
	}

	public boolean isFirst() {
		pageNum = (pageNum==0) ? 1 : pageNum;
		return pageNum==1;
	}

	public void setFirst(boolean first) {
		this.first = first;
	}

	public boolean isLast() {
		return pageNum == (int) getTotalLength();
	}

	public void setLast(boolean last) {
		this.last = last;
	}

	public long getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
	
	
}	
