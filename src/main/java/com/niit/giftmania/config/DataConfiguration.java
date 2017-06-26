package com.niit.giftmania.config;
import java.sql.DriverManager;
import java.util.Properties;

import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import com.niit.giftmania.dao.ProductDao;
import com.niit.giftmania.dao.ProductDaoImple;
import com.niit.giftmania.dao.UserDao;
import com.niit.giftmania.dao.UserDaoImple;

@Configuration
public class DataConfiguration {

	@Bean(name="dataSource")
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		System.out.println("## getDataSource :"+ dataSource);
		return dataSource;
	}
	
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource)throws Exception
	{
		Class.forName("org.h2.Driver");
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.put("hibernate.connection.driver_class","org.h2.Driver");
		properties.put("hibernate.show_sql","true");
		properties.put("hibernate.hbm2ddl.auto","update");
		
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		
		//Package contain entity classes
		factoryBean.setPackagesToScan(new String[] { "com.niit.giftmania.model" } );
		factoryBean.setDataSource(dataSource);
		factoryBean.setHibernateProperties(properties);
		factoryBean.afterPropertiesSet();
		
		SessionFactory sf = factoryBean.getObject();
		System.out.println("## getSessionFactory: " + sf);
		
	return sf;	 
	}
	
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);
		System.out.println("## getTransactionManager: " + txManager);
		return txManager;
	}
	
	@Bean(name="productBean")
	public ProductDao getProductDao()
	{
		return new ProductDaoImple();
		
	}
	
	@Autowired
	@Bean(name="userBean")
	public UserDao getUserDao()
	{
		return new UserDaoImple();
	}
}

