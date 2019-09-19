package com.dev.Exception;

public class CustomException extends Exception{

	public CustomException() {
		System.out.println("custom Exception");		
		
		
	}
	public CustomException(int i) {
		System.out.println("custom Exception with int arg");		
		
		
	}public CustomException(String s) {
		System.out.println("custom Exception with String");		
		
		
	}
	@Override
	public String getLocalizedMessage() {
		return "custom exception method";
		
	}
}
