package com.xyz.blog.cms.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xyz.blog.cms.domain.ArticleDao;
import com.xyz.blog.cms.domain.entity.Article;
import com.xyz.blog.cms.service.ArticleService;
import com.xyz.blog.sys.common.PageResult;
import com.xyz.blog.sys.common.SessionManager;
import com.xyz.blog.sys.common.utis.TimeUtis;
import com.xyz.blog.usr.domain.entity.User;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Resource(name="articleDao")
	private ArticleDao articleDao;
	
	@Override
	public int addArticle(Article article) throws Exception{
		User usr = (User) SessionManager.getUserSession().getAttribute("User");
		article.setId(UUID.randomUUID().toString());
		article.setCreateBy(usr.getUserName());
		article.setCreateDate(TimeUtis.Date2String(new Date()));
		return articleDao.addArticle(article);
	}

	@Override
	public int updateArticle(Article article) throws Exception{
		User usr = (User) SessionManager.getUserSession().getAttribute("User");
		article.setUpdateBy(usr.getUserName());
		article.setUpdateDate(TimeUtis.Date2String(new Date()));
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
	public PageResult<Article> getListArticle(Article article) throws Exception{
		PageResult<Article> page = new PageResult<Article>();
		//查询article列表
		List<Article> list = articleDao.getListArticle(article);
		//查询article总数
		long count = articleDao.getArticleCount(article);
		page.setResult(list);
		page.setTotalElements(count);
		return page;
	}

	@Override
	public int topArticle(Article article) throws Exception{
		return articleDao.topArticle(article);
	}

}
