package com.dev.ObjectMethods;

public class ObjectMethods extends Object/*for clone*/{

	public static void main(String[] args) {
		Dog d1=new Dog();
		Dog d2=new Dog();
		
		System.out.println(d1.getClass());
		//class named as class is present in the java API
		System.out.println(d2.getClass());
		Dog d3=new Dog();
		
		
	}

}
