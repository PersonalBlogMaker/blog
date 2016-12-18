package com.xyz.blog.cms.service;

import com.xyz.blog.cms.domain.entity.Article;
import com.xyz.blog.sys.common.PageResult;

public interface ArticleService {
	
	public int addArticle(Article article) throws Exception;
	
	public int updateArticle(Article article) throws Exception;
	
	public int deleteArticle(Article article) throws Exception;
	
	public Article getArticleById(Article article) throws Exception;
	
	public PageResult<Article> getListArticle(Article article) throws Exception;
	
	public int topArticle(Article article) throws Exception;
	
}
