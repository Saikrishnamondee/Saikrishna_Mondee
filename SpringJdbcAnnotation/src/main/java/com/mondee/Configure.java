package com.mondee;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Configure {
	
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource dm=new DriverManagerDataSource();
		dm.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dm.setUrl("jdbc:mysql://localhost:3306/mondee");
		dm.setUsername("root");
		dm.setPassword("Meta@123");
		
		return dm;
	}
	
	@Bean
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate jt=new JdbcTemplate();
		jt.setDataSource(getDataSource());
		return jt;
	}
	
	@Bean
	public SpringJdbcSelect getSpringJdbcSelect()
	{
		SpringJdbcSelect sj=new SpringJdbcSelect();
		sj.setJt(getTemplate());
		return sj;
	}
	
}