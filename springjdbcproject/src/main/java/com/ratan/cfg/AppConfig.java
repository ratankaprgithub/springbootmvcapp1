package com.ratan.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.ratan")
public class AppConfig {

	
	
	@Bean
	public JdbcTemplate jt() {
		
		/*
		 * JdbcTemplate template=new JdbcTemplate();
		 * 
		 * DriverManagerDataSource dm=new DriverManagerDataSource();
		 * 
		 * dm.setDriverClassName("com.mysql.jdbc.Driver");
		 * dm.setUrl("jdbc:mysql://localhost:3306/ratandb"); dm.setUsername("root");
		 * dm.setPassword("root");
		 * 
		 * 
		 * template.setDataSource(dm);
		 * 
		 * return template;
		 */
		
		
		
		  
		  DriverManagerDataSource dm=new DriverManagerDataSource();
		  
		  dm.setDriverClassName("com.mysql.jdbc.Driver");
		  dm.setUrl("jdbc:mysql://localhost:3306/ratandb"); dm.setUsername("root");
		  dm.setPassword("root");
		  
		  JdbcTemplate template=new JdbcTemplate(dm);
			
		  return template;
		 
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
