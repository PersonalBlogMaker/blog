package com.xyz.blog.cms.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.blog.cms.domain.entity.Article;
import com.xyz.blog.cms.service.ArticleService;
import com.xyz.blog.sys.common.ControllerResult;
import com.xyz.blog.sys.common.PageResult;

@RestController
@RequestMapping("/article")
public class ArticleController {
	
	@Autowired 
	private ArticleService articleService;
	
	//增加文章 
	@RequestMapping(value="/saveArticle",method=RequestMethod.POST)
	public ControllerResult saveArticle(@RequestBody Article article){
		ControllerResult c = new ControllerResult();
		try {
			articleService.addArticle(article);
		} catch (Exception e) {
			e.printStackTrace(); 
			c.setCode("401");
			c.setSuccess(-1);
			c.setMsg("业务逻辑错误");
		}
		return c;
	}
	
	//修改文章
	@RequestMapping(value="/updateArticle",method=RequestMethod.POST)
	public ControllerResult updateArticle(@RequestBody Article article){
		ControllerResult c = new ControllerResult();
		try {
			articleService.updateArticle(article);
		} catch (Exception e) {
			e.printStackTrace();
			c.setCode("401");
			c.setSuccess(-1);
			c.setMsg("业务逻辑错误");
		}
		return c;
	}
	
	//根据id查看文章内容，并增加一次阅读数量
	@RequestMapping(value="/getArticleById",method=RequestMethod.GET)
	public ControllerResult getArticleById(Article article){
		ControllerResult c = new ControllerResult();
		try {
			List<Article> list = new ArrayList<Article>();
			article = articleService.getArticleById(article);
			c.setRows(list);
		} catch (Exception e) {
			e.printStackTrace();
			c.setCode("401");
			c.setSuccess(-1);
			c.setMsg("业务逻辑错误");
		}
		return c;
	}
	
	//获得文章列表
	@RequestMapping(value="/getListArticle",method=RequestMethod.GET)
	public ControllerResult getListArticle(Article article){
		ControllerResult c = new ControllerResult();
		try {
			PageResult<Article> page = articleService.getListArticle(article);
			c.setRows(page.getResult());
			c.setTotalElements(page.getTotalElements());
			c.setTotalPages(page.getTotalLength());
			c.setFirst(page.isFirst());
			c.setLast(page.isLast());
		} catch (Exception e) {
			e.printStackTrace();
			c.setCode("401");
			c.setSuccess(-1);
			c.setMsg("业务逻辑错误");
		}
		return c;
	}
	
	//删除文章
	@RequestMapping(value="/deleteArticle",method=RequestMethod.GET)
	public ControllerResult deleteArticle(Article article){
		ControllerResult c = new ControllerResult();
		try {
			articleService.deleteArticle(article);
		} catch (Exception e) {
			e.printStackTrace();
			c.setCode("401");
			c.setSuccess(-1);
			c.setMsg("业务逻辑错误");
		}
		return c;
	}
	
	//置顶该文章
	@RequestMapping(value="/topArticle",method=RequestMethod.GET)
	public ControllerResult topArticle(Article article){
		ControllerResult c = new ControllerResult();
		try {
			articleService.topArticle(article);
		} catch (Exception e) {
			e.printStackTrace();
			c.setCode("401");
			c.setSuccess(-1);
			c.setMsg("业务逻辑错误");
		}
		return c;
	}
	
	@RequestMapping("/A")
	public String A(){
		System.out.println( new Date().toString());
		return new Date().toString();
	}
	
}
