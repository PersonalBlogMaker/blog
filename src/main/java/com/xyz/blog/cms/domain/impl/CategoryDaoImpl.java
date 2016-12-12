package com.xyz.blog.cms.domain.impl;

import org.springframework.stereotype.Repository;

import com.xyz.blog.cms.domain.CategoryDao;
import com.xyz.blog.cms.domain.entity.Category;

@Repository("jdbcCategoryDao")
public class CategoryDaoImpl implements CategoryDao {

	@Override
	public int saveCategory(Category cg) {
		return 0;
	}

}
