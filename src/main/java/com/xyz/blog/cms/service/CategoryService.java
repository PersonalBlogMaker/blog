package com.xyz.blog.cms.service;

import java.util.List;

import com.xyz.blog.cms.controller.bo.CategoryBo;
import com.xyz.blog.cms.domain.entity.Category;

public interface CategoryService {
	
	public int addCategory(Category cg) throws Exception;
	
	public List<CategoryBo> getListCategory(CategoryBo cg) throws Exception;
	
	public int updateCategory(Category cg) throws Exception;
}
