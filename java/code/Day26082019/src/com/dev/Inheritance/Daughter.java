package com.dev.Inheritance;

public class Daughter extends Father {
	static Daughter d=new Daughter();

	@Override
	public void printName() {
		String name="Arya";
 		System.out.println(name+" "+super.name+" "+f.Lastname);
	}
	
	public static void main(String[] args) {
		d.printName();
		

	}

	

}
