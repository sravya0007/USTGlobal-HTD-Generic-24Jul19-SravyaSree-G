package com.dev.Exception;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double b=10.0;
//		int q=0;
//		System.out.println("result: "+b/0);

		System.out.println("before");
		t();
		//StringBuffer sb=new StringBuffer(-3);
	System.out.println("after");	
	}
	public static void s() {
		StringBuffer sb=new StringBuffer(-3);
	}
	public static void t() {
		s();
	}
}
/*Exception in thread "main" java.lang.NegativeArraySizeException
*at java.lang.AbstractStringBuilder.<init>(Unknown Source)
*at java.lang.StringBuffer.<init>(Unknown Source)
*at com.dev.Exception.ExceptionExample.s(ExceptionExample.java:17)
*at com.dev.Exception.ExceptionExample.t(ExceptionExample.java:20)
*at com.dev.Exception.ExceptionExample.main(ExceptionExample.java:12)
*/