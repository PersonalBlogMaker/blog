package com.xyz.blog.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;


import com.xyz.blog.cms.domain.ArticleDao;
import com.xyz.blog.cms.domain.entity.Article;
import com.xyz.blog.cms.service.ArticleService;

public class ArticleServiceImpl implements ArticleService{

	@Resource(name="articleDao")
	private ArticleDao articleDao;
	
	@Override
	public int addArticle(Article article) throws Exception{
		return articleDao.addArticle(article);
	}

	@Override
	public int updateArticle(Article article) throws Exception{
		return articleDao.updateArticle(article);
	}

	@Override
	public int deleteArticle(Article article) throws Exception{
		return articleDao.deleteArticle(article);
	}

	@Override
	public Article getArticleById(Article article) throws Exception{
		return articleDao.getArticleById(article);
	}

	@Override
	public List<Article> getListArticle(Article article) throws Exception{
		return articleDao.getListArticle(article);
	}

	@Override
	public int topArticle(Article article) throws Exception{
		return articleDao.topArticle(article);
	}

}
