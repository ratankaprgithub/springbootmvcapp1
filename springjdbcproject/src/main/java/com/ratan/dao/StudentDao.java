package com.ratan.dao;

import com.ratan.beans.StudentBean;

public interface StudentDao {
	
	public StudentBean getStudentByRoll(int roll);
	
	public String insertStudent(StudentBean student);

}
