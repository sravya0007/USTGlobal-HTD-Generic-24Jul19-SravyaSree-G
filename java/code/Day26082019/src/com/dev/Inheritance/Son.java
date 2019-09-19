package com.dev.Inheritance;

public class Son extends Father {
	static Son s=new Son();
	@Override
	public void printName() {
		String name="Robb";
 		System.out.println(name+" "+super.name+" "+f.Lastname);
 		super.printName();
	}
	
	public static void main(String[] args) {
		s.printName();
		

	}

	

}
