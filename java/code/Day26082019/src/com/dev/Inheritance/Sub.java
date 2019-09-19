package com.dev.Inheritance;

public class Sub extends SuperClass {
	public Sub() {
		super();
		System.out.println("Constructor in Sub class with no-arguments of SuperClass");

	}

	public Sub(int i) {
		super(12);
		System.out.println("Constructor in Sub class with int-arg of SuperClass");

	}

	public Sub(String s) {
		super(s);
		System.out.println("Constructor in Sub class with String-arg of SuperClass");

	}

	public Sub(int i, String s) {
		System.out.println("Constructor in Sub class with int and String arg of SuperClass");

	}

	public Sub(String s, int i) {
		System.out.println("Constructor in Sub class with  String and int arg of SuperClass");

	}

	public static void main(String[] args) {
		Sub s = new Sub();

	}

}
