package com.xyz.blog.cms.domain;

import com.xyz.blog.cms.controller.bo.CategoryBo;
import com.xyz.blog.cms.domain.entity.Category;
import com.xyz.blog.sys.domain.CudDao;
import com.xyz.blog.sys.domain.ReadDao;

public interface CategoryDao extends CudDao<Category>, ReadDao<CategoryBo>{


}
