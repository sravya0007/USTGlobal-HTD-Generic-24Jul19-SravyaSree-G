package com.dev.Methods;

import com.dev.encapsulation.Dog;

public class demoEnc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//way to access the clss in another package using import statement
		Dog d= new Dog();
		Dog d1= new Dog();
		//way to access the clss in another package using Qualified name
		com.dev.Inheritance.Son son=new com.dev.Inheritance.Son();
	}
	final static void print() {
		System.out.println("final");
		
	}

}
