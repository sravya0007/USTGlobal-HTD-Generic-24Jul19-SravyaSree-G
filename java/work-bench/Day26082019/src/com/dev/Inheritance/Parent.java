package com.dev.Inheritance;

public class Parent {
	
  void Parent() {
	 System.out.println("parent cnst without arg");
 }
	void printName() {
		System.out.println("heiii this is printName");
		
	}
	
	private void printName(String s) {
		System.out.println("int private");
		
	}
	protected void printName(float f) {
		System.out.println("using protected");
	}
	
	final void printName(double d)
	{
		System.out.println("using final");
		
	}
	public static void p() {
		System.out.println("using Static");
	}
	public static void main(String[] args) {
		Parent p=new Parent();
	p.printName();

//	
		}

}
