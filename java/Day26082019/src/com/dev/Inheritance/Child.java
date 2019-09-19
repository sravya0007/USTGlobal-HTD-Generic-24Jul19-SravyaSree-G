package com.dev.Inheritance;

public class Child extends Parent{
	Child() {
		System.out.println("child cnst without arg");
	}

	public static void main(String[] args) {
		Child c=new Child();
		c.printName();
		c.printName(1);
		//c.printName("sra");--------->

	}
	
	
	@Override
	void printName() {
		System.out.println("printName in child");
	}
	void printName(int i) {
		System.out.println("printName in child with value i="+i);
	}
}
