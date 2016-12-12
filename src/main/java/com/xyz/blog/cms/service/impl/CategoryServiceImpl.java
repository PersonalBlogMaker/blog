package com.xyz.blog.cms.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xyz.blog.cms.domain.CategoryDao;
import com.xyz.blog.cms.domain.entity.Category;
import com.xyz.blog.cms.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Resource(name="categoryDao")
	private CategoryDao categoryDao;

	@Override
	public int addCategory(Category cg) throws Exception {
		return categoryDao.saveCategory(cg);
	}
	
}
