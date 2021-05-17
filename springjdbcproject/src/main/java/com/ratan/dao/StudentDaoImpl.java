package com.ratan.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ratan.beans.StudentBean;

@Repository
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public StudentBean getStudentByRoll(int roll) {
		
	StudentBean student=jdbcTemplate.queryForObject("select * from student where roll=?", (rs,num)-> new StudentBean(rs.getInt("roll"),rs.getString("name"),rs.getInt("marks"))
			, roll);
		
		
		return student;
		
	}

	public String insertStudent(StudentBean student) {

		 int x=jdbcTemplate.update("insert into student values(?,?,?)",student.getRoll(),student.getName(),student.getMarks());
	

		 if(x > 0)
			 return "record inserted sucessfully";
		 else
			 return "insertion fails..";
		 
		 
	}

	
}
