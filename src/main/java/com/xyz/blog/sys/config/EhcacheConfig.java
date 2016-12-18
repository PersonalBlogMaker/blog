package com.xyz.blog.sys.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import net.sf.ehcache.CacheManager;


/**
 * 启动 ehcache缓存
 * @author hasee
 *
 */
@Configuration
@EnableCaching                              //启动缓存
public class EhcacheConfig {
	
	/**
	 * 声明缓存管理器
	 * @return
	 */
	@Bean
	public EhCacheCacheManager cacheManager(CacheManager cm){
		return new EhCacheCacheManager(cm);
	}
	
	@Bean
	public EhCacheManagerFactoryBean ehcache(){
		EhCacheManagerFactoryBean cacheManagerFactoryBean = 
				new EhCacheManagerFactoryBean();
		cacheManagerFactoryBean.setConfigLocation(new ClassPathResource("conf/ehcache.xml"));
		return  cacheManagerFactoryBean;
	}
	
	
	
}
