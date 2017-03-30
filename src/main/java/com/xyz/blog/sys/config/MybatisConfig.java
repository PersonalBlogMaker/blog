package com.xyz.blog.sys.config;

import javax.sql.DataSource;

import org.apache.ibatis.io.VFS;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan("com.xyz.blog.*.domain")
public class MybatisConfig {

    @Autowired
    private Environment evn;

    @Autowired
    private DataSource dt;

//	@Bean
//	@Primary
//	@ConfigurationProperties(prefix="jdbc")
//	public DataSource getDataSource() throws Exception{
//		return new DruidDataSource();
//	}

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dt) throws Exception {

//		SqlSessionFactoryBean sfb = new SqlSessionFactoryBean();
//		sfb.setDataSource(dt);
//		sfb.setTypeAliasesPackage(evn.getProperty("mybatis.typeAliasesPackage"));
//		sfb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(evn.getProperty("mybatis.mapperLocations")));
//		return sfb.getObject();
        VFS.addImplClass(SpringBootVFS.class);

        DefaultSqlSessionFactoryBean sessionFactory = new DefaultSqlSessionFactoryBean();
        sessionFactory.setDataSource(dt);
        sessionFactory.setTypeAliasesPackage(evn.getProperty("mybatis.typeAliasesPackage"));
//      sessionFactory
//              .setConfigLocation(new PathMatchingResourcePatternResolver().getResource(properties.configLocation));
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(evn.getProperty("mybatis.mapperLocations")));
        SqlSessionFactory resultSessionFactory = sessionFactory.getObject();
        return resultSessionFactory;


    }

}
