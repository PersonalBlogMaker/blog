package com.xyz.blog.cms.service;

import java.util.List;

import com.xyz.blog.cms.domain.entity.Article;

public interface ArticleService {
	
	public int addArticle(Article article) throws Exception;
	
	public int updateArticle(Article article) throws Exception;
	
	public int deleteArticle(Article article) throws Exception;
	
	public Article getArticleById(Article article) throws Exception;
	
	public List<Article> getListArticle(Article article) throws Exception;
	
	public int topArticle(Article article) throws Exception;
	
}
