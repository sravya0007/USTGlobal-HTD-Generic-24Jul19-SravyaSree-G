package com.dev.Exception;

public class Except_ {
	public static void main (String[] args) throws Exception{
		try{
		//		s();
				System.out.println("No Excpetion for caught");
				
		int res=divide(10,1);
		System.out.println("No Excpetion for divide");
		System.out.println(res);
			}
		
		catch(NegativeArraySizeException e) {
			System.err.println("Exception caught in catch block");
			System.err.println("e.getMessage():"+e.getMessage());
			e.printStackTrace();
			}
		
		catch(ArithmeticException e) {
			System.out.println("Exception caught in catch block");
			System.out.println("e.getMessage():"+e.getMessage());
			
			}	
		
		catch(Exception e) {
			System.out.println("Exception caught in catch block");
			System.out.println("e.getMessage():"+e.getMessage());
			
			}	
		finally {
			System.out.println("Finally");
		}
		}public static int divide(int i,int j)throws Exception{
			int res=i/j;
			return res;
			
		}
		
	
}
