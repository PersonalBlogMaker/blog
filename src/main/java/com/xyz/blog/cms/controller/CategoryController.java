package com.xyz.blog.cms.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.xyz.blog.cms.domain.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.blog.cms.domain.entity.Category;
import com.xyz.blog.cms.service.CategoryService;
import com.xyz.blog.sys.common.ControllerResult;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired 
	private CategoryService categoryServiceImpl;
	
	/**
	 * 保存栏目
	 * @param
	 * @return
	 */
	@RequestMapping(value="/saveCategory", method=RequestMethod.POST)
	public ControllerResult saveCategory(@RequestBody Category category){
		ControllerResult c = new ControllerResult();
		try {
			List<Integer> list = new ArrayList<Integer>();
			list.add(categoryServiceImpl.addCategory(category));
			c.setRows(list);
		} catch (Exception e) {
			e.printStackTrace();
			c.setCode("401");
			c.setSuccess(-1);
			c.setMsg("业务逻辑错误");
		}
		return c;
	}
	
	@RequestMapping(value="/getListCategory",method=RequestMethod.GET)
	public ControllerResult getListCategory(Category category){
		ControllerResult c = new ControllerResult();
		try {
			c.setRows(categoryServiceImpl.getListCategory(category));
		} catch (Exception e) {
			e.printStackTrace();
			c.setCode("401");
			c.setMsg("业务逻辑错误");
			c.setSuccess(-1);
		}
		return c;
	}
	
	@RequestMapping(value="/updateCategory",method=RequestMethod.POST)
	public ControllerResult updateCategory(@RequestBody Category category){
		ControllerResult c = new ControllerResult();
		try {
			List<Integer> list = new ArrayList<Integer>();
			list.add(categoryServiceImpl.updateCategory(category));
			c.setRows(list);
		} catch (Exception e) {
			e.printStackTrace();
			c.setCode("401");
			c.setMsg("业务逻辑错误");
			c.setSuccess(-1);
		}
		return c;
	}
	
	
	@RequestMapping(value = "/A", method = RequestMethod.GET)
	public Article A(Article article2){
		System.out.println( new Date().toString());
		Article article = new Article();
		String weight = "2";
		if (article2!=null){
//			weight = article2.getWeight();
		}
//		article.setWeight(weight);
		return article;
	}
		
}
