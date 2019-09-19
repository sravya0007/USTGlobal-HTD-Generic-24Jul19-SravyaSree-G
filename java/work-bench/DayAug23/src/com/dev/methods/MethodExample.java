package com.dev.methods;

public class MethodExample {

	public static void main(String[] args) {
		int area = calcArea(13);
		System.out.println(area);
	double c=circle.CircleArea(8);
	System.out.println(c);

	}

	public static int calcArea(int side) {
		int area = side * side;
		return area;

	}

}
class circle{
	
	public static double CircleArea(int rad) {
		double a =3.4*rad*rad;
		return a;
		
	}
	
}