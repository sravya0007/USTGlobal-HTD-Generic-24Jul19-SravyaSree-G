package com.dev.Methods;

public class MethodExample2 {
	static int i=0;
	static char c=' ';
	static String s=" ";
	static byte b=0;
	
	static MethodExample2 m2=new MethodExample2();

	
	
	public static void main(String[] args) {
		
//		MethodExample2 m2=new MethodExample2();
		double area = calcArea(85);
		System.out.println("Area of the square is  ="+area );
	
		double r = m2.recArea(8,5);
		System.out.println("Area of the rectangle is  ="+r );
	
	}

public static double calcArea(int r)
{
	i=r*r*r;
	
	return i;
	
}
public static int recArea(int l,int b)
{
	i =l*b;
	double area = calcArea(24);
	System.out.println("Area of the square from rec is  ="+area );

	return i;
	
}
}
