package com.ratan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.ratan.beans.StudentBean;
import com.ratan.utility.DBUtil;


@Repository
public class StudentDaoImpl implements StudentDao{

	


	public StudentBean getStudentByRoll(int roll) {

		StudentBean student =null;
	
		
		try {
			
		Connection conn=DBUtil.provideConnection();
			
			PreparedStatement ps=conn.prepareStatement("select * from student where roll=?");
			
			ps.setInt(1, roll);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				int r=rs.getInt("roll");
				String n=rs.getString("name");
				int m=rs.getInt("marks");
				
				student = new StudentBean(r, n, m);
				
			}
			
			
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return student;
	}

	public String insertStudent(StudentBean student) {

			String result="not inserted";
	
			Connection conn = DBUtil.provideConnection();
	
			try {
				PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?)");
				
				ps.setInt(1, student.getRoll());
				ps.setString(2, student.getName());
				ps.setInt(3, student.getMarks());
				
				int x= ps.executeUpdate();
				
				if(x >0)
					result="Record Inserted Sucesfully";
				
			} catch (SQLException e) {
				
				result = e.getMessage();
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	
	
	
	
	
	
	
	
			return result;
	
	
	
	}



}
