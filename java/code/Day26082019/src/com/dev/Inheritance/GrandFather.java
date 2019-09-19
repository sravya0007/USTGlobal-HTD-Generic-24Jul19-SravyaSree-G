package com.dev.Inheritance;

public class GrandFather {

	static GrandFather g=new GrandFather();
	
	String Lastname="Stark";
	String name="Torrhen";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		g.printName();
		
}
		
		 void printName() {
			
			System.out.println(name+" "+g.Lastname);
		
	}

}
