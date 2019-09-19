package com.dev.Methods;

public class MethodOverlloading {
static MethodOverlloading  mo=new MethodOverlloading();
	
public void print() {
	System.out.println("method with no args");
}

public int print(int i) {
	System.out.println("method with int as args and i = "+i);
	return i;
}
static String print(String s) {
	
	System.out.println("method with int as args and s = "+s);
	return s;
	
}


public static void main(String []args) {
		mo.print();
		mo.print(1);
		mo.print("sravya");
	
}


}
