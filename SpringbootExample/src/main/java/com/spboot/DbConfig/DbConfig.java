package com.spboot.DbConfig;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.spboot.model.User;

@Configuration
public class DbConfig {

	@Value(value = "${db.driver}")
	private String driver;

	@Value(value = "${db.url}")
	private String url;
	
	@Value(value = "${db.username}")
	private String username;
	
	@Value(value = "${db.password}")
	private String password;
	
	@Value(value = "${hibernate.dialect}")
	private String dialect;
	
	@Value(value = "${hibernate.hbm2ddl}")
	private String hbm2ddl;
	
	@Value(value = "${hibernate.show}")
	private String show;


	
	@Bean
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory()
	{
		LocalSessionFactoryBean sf=new LocalSessionFactoryBean();
		sf.setDataSource(getDataSource());
		
		Properties ps=new Properties();
		ps.setProperty("hibernate.dialect", dialect);
		ps.setProperty("hibernate.hbm2ddl.auto", hbm2ddl);
		ps.setProperty("hibernate.show_sql", show);
		
		sf.setHibernateProperties(ps);
		sf.setAnnotatedClasses(User.class);
		
		return sf;
	}
}
