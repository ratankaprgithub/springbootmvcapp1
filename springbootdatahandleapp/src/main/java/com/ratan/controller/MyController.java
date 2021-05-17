package com.ratan.controller;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ratan.beans.Address;
import com.ratan.beans.CustomAddressEditor;
import com.ratan.beans.StudentBean;
import com.ratan.dao.StudentDao;
import com.ratan.validators.StudentValidator;

@Controller
public class MyController {
	
	@Autowired
	StudentDao dao;
	
	

	
	  @RequestMapping(value = "/") 
	  public String home(Model model) {
	  
		  StudentBean st=new StudentBean();
		 
		  
		  model.addAttribute("student",st);
		  
		  return "index"; 
	  
	  }
	 

	
	
	
	
	@GetMapping("/register")
	public ModelAndView registerStudent(@Valid @ModelAttribute("student")StudentBean student,BindingResult br) {
		
		
		if(br.hasErrors()) {
			
			//return new ModelAndView("index");
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("index");
			
			return mv;
			
			
		}else {
		
		
		
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("sucess");
	
		
	//	String result=dao.insertStudent(student);
		
		//mv.addObject("resultData", student);
		
		
		return mv;
		
		}
	}
	

	
	
	

}
