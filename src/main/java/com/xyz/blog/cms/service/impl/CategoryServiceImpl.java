package com.xyz.blog.cms.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xyz.blog.cms.domain.CategoryDao;
import com.xyz.blog.cms.domain.entity.Category;
import com.xyz.blog.cms.service.CategoryService;
import com.xyz.blog.sys.common.SessionManager;
import com.xyz.blog.sys.common.utis.TimeUtis;
import com.xyz.blog.usr.domain.entity.User;

/**
 * 时间转换工具类
 * @author ha ha ha 
 *
 */
@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Resource(name="categoryDao")
	private CategoryDao categoryDao;

	@Override
	public int addCategory(Category cg) throws Exception {
		User usr = (User) SessionManager.getUserSession().getAttribute("User");
		cg.setId(UUID.randomUUID().toString());
		cg.setCreateBy(usr.getUserName());
		cg.setCreateDate(TimeUtis.Date2String(new Date()));
		return categoryDao.addCategory(cg);
	}

	@Override
	public List<Category> getListCategory(Category cg) throws Exception {
		return categoryDao.getListCategory(cg);
	}

	@Override
	public int updateCategory(Category cg) throws Exception {
		User usr = (User) SessionManager.getUserSession().getAttribute("User");
		cg.setUpdateBy(usr.getUserName());
		cg.setUpdateDate(TimeUtis.Date2String(new Date()));
		return categoryDao.updateCategory(cg);
	}

	
}
