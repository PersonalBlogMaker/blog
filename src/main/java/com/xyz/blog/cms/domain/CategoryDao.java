package com.xyz.blog.cms.domain;

import java.util.List;

import com.xyz.blog.cms.domain.entity.Category;

public interface CategoryDao {
	
	public int addCategory(Category cg);
	
	public List<Category> getListCategory(Category cg);

	public int updateCategory(Category cg);

}
