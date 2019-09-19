package com.dev.Inheritance;

public class Father extends GrandFather {
	
	static Father f=new Father();
	String name="Eddard";
	
	public void printName() {
	 		System.out.println(name+" "+super.name+" "+f.Lastname);
// 	 		super.printName();
//	
	}
//	
 	public static void main(String[] args) {
	 			f.printName();
	}
 	

}
