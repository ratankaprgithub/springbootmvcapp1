package com.ratan.apps;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratan.beans.StudentBean;
import com.ratan.dao.StudentDao;

@Service
public class JdbcApp {
	
	@Autowired
	private StudentDao dao;
	
	public void insertStudent() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Roll");
		int roll=sc.nextInt();
		
		System.out.println("Enter Name");
		String name=sc.next();
		
		System.out.println("Enter Marks");
		int marks=sc.nextInt();
		
		
		StudentBean student = new StudentBean(roll, name, marks);
		
		
		String result = dao.insertStudent(student);
		
		System.out.println(result);
		
	}
	
	
	
	

}
