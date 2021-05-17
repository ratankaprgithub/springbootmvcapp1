package com.ratan.beans;

import java.beans.PropertyEditorSupport;

public class CustomAddressEditor extends PropertyEditorSupport {
	
	private String enteredText="";
	
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		String str[]=text.split("-");
		
		if(str.length == 3) {
			
			Address addr = new Address(str[0], str[1], str[2]);
			
			setValue(addr); // this method will set the address obj to the formbacking class property
			
		}else {
			
			enteredText = text;
			
		}
	
		
	}
	
	@Override
	public String getAsText() {

	
		String result = enteredText;
		
		 Object obj= getValue();
		 
		 if(obj != null)
		 {
			 Address addr=(Address)obj;
		 	result = addr.getCountry()+":"+addr.getState()+":"+addr.getCity();
		 }	
		 
		 
		 
		 	return result;
	
	
	}

}
