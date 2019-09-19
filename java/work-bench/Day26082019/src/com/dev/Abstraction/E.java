package com.dev.Abstraction;

public class E implements Abs,Abc{

	public static void main(String[] args) {
		E e=new E();
		e.display();
	}

	@Override
	public void display() {
		System.out.println("Display in child from Abs");
		
	}
	

}
