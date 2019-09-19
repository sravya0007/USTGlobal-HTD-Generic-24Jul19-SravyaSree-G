package com.dev.Inheritance;

public class Cricket extends Outdoor{
	static Cricket c=new Cricket();
	String type="Cricket";

	public static void main(String[] args) {
		c.printName();
		

	}
	public void printName() {
		System.out.println("type is "+type+", "+super.motto);
	}

}
