package com.xyz.blog.cms.domain;

import org.springframework.stereotype.Repository;

import com.xyz.blog.cms.domain.entity.Category;

public interface CategoryMapper {
	
	public int saveCategory(Category cg);
	
}
