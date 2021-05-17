package com.ratan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ratan.apps.JdbcApp;
import com.ratan.cfg.AppConfig;

public class JdbcMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		JdbcApp app= ctx.getBean("jdbcApp",JdbcApp.class);
		
		
		app.insertStudent();
		
		

	}

}
