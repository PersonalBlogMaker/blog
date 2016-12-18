package com.xyz.blog.sys.common;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ControllerResult implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 1:成功
	 * -1:失败
	 */
	private Integer success = 1;
	
	/**
	 * 状态码
	 */
	private String code = "ok";
	
	/**
	 * 提示信息
	 */
	private String msg ="";
	
	/**
	 * 记录数
	 */
	private Long totalElements;
	
	/**
	 * 页数
	 */
	private Long totalPages;
	
	/**
	 * 每页记录数
	 */
	private Integer pageSize ;
	
	/**
	 * 第几页
	 */
	private Integer pageNum;
	
	/**
	 * 是否第一页
	 */
	private Boolean first ;
	
	/**
	 * 是否最后一页
	 */
	private Boolean last ;
	
	/**
	 * 数据
	 */
	private List<?> rows;

	public Integer getSuccess() {
		return success;
	}

	public void setSuccess(Integer success) {
		this.success = success;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Long totalElements) {
		this.totalElements = totalElements;
	}

	public Long getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}

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

	public Boolean getFirst() {
		return first;
	}

	public void setFirst(Boolean first) {
		this.first = first;
	}

	public Boolean getLast() {
		return last;
	}

	public void setLast(Boolean last) {
		this.last = last;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
