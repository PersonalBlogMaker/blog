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
	private Integer totalElements;
	
	/**
	 * 页数
	 */
	private Integer totalPages;
	
	/**
	 * 每页记录数
	 */
	private Integer size ;
	
	/**
	 * 第几页
	 */
	private Integer number;
	
	/**
	 * 是否第一页
	 */
	private Boolean first ;
	
	/**
	 * 是否第二页
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

	public Integer getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
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
