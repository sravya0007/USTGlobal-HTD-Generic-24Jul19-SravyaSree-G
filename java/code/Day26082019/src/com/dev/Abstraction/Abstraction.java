package com.dev.Abstraction;

public class Abstraction extends AbstractExample {

	public Abstraction() {
		System.out.println("costr of abstraction child class ");

	}

	@Override
	public void display() {
		System.out.println("display concrete method of abstract child class");
	}

	public static void main(String[] args) {
		Abstraction a = new Abstraction();
		a.display();
		a.show();

	}

}
