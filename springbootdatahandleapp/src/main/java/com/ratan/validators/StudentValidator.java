package com.ratan.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.ratan.beans.StudentBean;

@Component
public class StudentValidator implements Validator{

	@Override
	public boolean supports(Class<?> cl) {
		
	return StudentBean.class.isAssignableFrom(cl);
		
		
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		
			 StudentBean st= (StudentBean)target;
			 
			 if(st.getRoll() < 100)
				 errors.rejectValue("roll", "roll.invalid",new Object[] {"100","500"},"Roll should be greater that 100" );
			 
			 if(st.getName().equals(""))
				 errors.rejectValue("name", "", "Name is mandaotry...");
		
	}

}
