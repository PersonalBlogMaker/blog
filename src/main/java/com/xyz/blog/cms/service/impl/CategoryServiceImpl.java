package com.xyz.blog.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.blog.cms.domain.CategoryMapper;

@Service
public class CategoryServiceImpl {
	
	@Autowired
	private CategoryMapper categoryMapper;
	
}
