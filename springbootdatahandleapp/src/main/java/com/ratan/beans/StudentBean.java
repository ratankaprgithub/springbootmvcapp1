package com.ratan.beans;

import java.util.Date;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;




public class StudentBean {


	@Min(value = 10,message = "roll is minimum 10")
	private Integer roll;
	
	
	private String name;
	
	private Integer marks;
	
public StudentBean() {
	// TODO Auto-generated constructor stub
}

public Integer getRoll() {
	return roll;
}

public void setRoll(Integer roll) {
	this.roll = roll;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getMarks() {
	return marks;
}

public void setMarks(Integer marks) {
	this.marks = marks;
}

public StudentBean(@Min(value = 10, message = "roll is minimum 10") Integer roll, String name, Integer marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
}






}