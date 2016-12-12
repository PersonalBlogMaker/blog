package com.xyz.blog.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.blog.cms.domain.entity.Category;
import com.xyz.blog.cms.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired 
	private CategoryService categoryServiceImpl;
	
	@RequestMapping("/saveCategory")
	public int saveCategory(Category c){
		try {
			return categoryServiceImpl.addCategory(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 2;
	}
	
	
	@RequestMapping("/A")
	public String A(){
		return " 123";
	}
		
}
