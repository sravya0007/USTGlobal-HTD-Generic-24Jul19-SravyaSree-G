package com.dev.Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			s();
		}
		catch (Exception e) {
			// TODO: handle exception
		//	System.out.println("exception occured");
			e.printStackTrace();//used to display the exception
			
			
			/*
			 * if there is catch block is empty66t 
			 * this is finally block 
			 * code after execution
			 */
		}
		
		/* if there is no catchblock
		 * Exception in thread "main" java.lang.NegativeArraySizeException at
		 * java.lang.AbstractStringBuilder.<init>(Unknown Source) at
		 * java.lang.StringBuffer.<init>(Unknown Source) at
		 * com.dev.Exception.ExceptionHandling.s(ExceptionHandling.java:20) at
		 * com.dev.Exception.ExceptionHandling.main(ExceptionHandling.java:7)
		 * 
		 */		
		
finally
{System.out.println("this is finally block");
	}
		System.out.println("code after execution");
	}
	public static void s() throws CustomException{
		int i=1;
		if(i<0) {
			System.out.println("e.getMessage():"+new CustomException().getMessage());
			/*
			 * //.getLocalizedMessage() to get the custom message
			 */
		}
		StringBuffer sb=new StringBuffer(-3);
	}
	
}
