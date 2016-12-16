package com.xyz.blog.cms.domain;

import java.util.List;

import com.xyz.blog.cms.domain.entity.Article;

public interface ArticleDao {
		
	public int addArticle(Article article);
	
	public int updateArticle(Article article);
	
	public int deleteArticle(Article article);
	
	public Article getArticleById(Article article);
	
	public List<Article> getListArticle(Article article);
	
	public int topArticle(Article article);
	
	public int getArticleCount(Article article);
	
}
