package com.dev.Exception;

public class ExceptionHandling1 {

	public static void main (String[] args) throws Exception,CustomException{
		// TODO Auto-generated method stub
		//System.out.println("before exceuution");	
		//s();
		/*// without throws exception in main method 
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		 * Unhandled exception type Exception
		 * 
		 * at com.dev.Exception.ExceptionHandling1.main(ExceptionHandling1.java:7)
		 */
		//System.out.println("after exceuution");  
		
	
		
		try {s();
		int res=divide(10,0);
		System.out.println("No Excpetion for divide");
		System.out.println(res);
	}
	catch(ArithmeticException e) {
		System.out.println("Exception caught in catch block"+e.getMessage());
			/*
			 * WITHOUT PRINT STACK TRACE 
			 * custom Exception cuatom messagecustom exception
			 * method Exception caught in catch block/ by zero
			 */
	//	e.printStackTrace();
			/*
			 * custom Exception cuatom messagecustom exception method Exception caught in
			 * catch block/ by zero java.lang.ArithmeticException: / by zero 
			 * FOR PRINTSTACK TRACE
			 * at com.dev.Exception.ExceptionHandling1.divide(ExceptionHandling1.java:30) at
			 * com.dev.Exception.ExceptionHandling1.main(ExceptionHandling1.java:20)
			 */
	}
	}
	public static int divide(int i,int j)throws Exception{
		int res=i/j;
		return res;
		
	}
	
	
	public static void s() throws Exception,NegativeArraySizeException{
		try{
			StringBuffer sb=new StringBuffer(-22);
		}
		catch(Exception e) {
		System.out.println("cuatom message"+new CustomException().getLocalizedMessage());
			//new CustomException().printStackTrace();
		}
		}
	}

