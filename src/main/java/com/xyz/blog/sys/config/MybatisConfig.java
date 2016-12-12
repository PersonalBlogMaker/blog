package com.xyz.blog.sys.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@MapperScan("com.xyz.blog.*.domain")
public class MybatisConfig {
	
	@Bean
	@Primary
	@ConfigurationProperties(prefix="jdbc")
	public DataSource getDataSource() throws Exception{
		return new DruidDataSource();
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dt) throws Exception{
		
		SqlSessionFactoryBean sfb = new SqlSessionFactoryBean();
		sfb.setDataSource(dt);
		sfb.setTypeAliasesPackage("com.xyz.blog");
		sfb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/*.xml"));
		return sfb.getObject();
	
	}

}
