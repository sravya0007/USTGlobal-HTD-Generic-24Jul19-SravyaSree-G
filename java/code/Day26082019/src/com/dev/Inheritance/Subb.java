package com.dev.Inheritance;

public class Subb extends Sub {
	
//	public Subb() {
//		System.out.println("Subclass const witout arg");
//	}

	public Subb(int i) {
		super(1);
		System.out.println("Subclass const with int  arg");
	}

	public Subb(String i) {
		super("Sravya");
		System.out.println("Subclass const with String arg");
	}
//
//	public Subb(int i, String s) {
//		super(1, "Sravya");
//		System.out.println("Subclass const with int and String  arg");
//	}
//
//	public Subb(String s, int i) {
//		super("Sravya", 1);
//		System.out.println("Subclass const with int  arg");
//	}

	public static void main(String[] args) {
Subb ss=new Subb("ryeui");

}

}
