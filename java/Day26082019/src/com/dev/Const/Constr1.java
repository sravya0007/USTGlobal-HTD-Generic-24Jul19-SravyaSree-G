package com.dev.Const;

public class Constr1 {
	public /*static*/ Constr1(int i) {//constrctr cant be static and dont have return type
		System.out.println("we are in parameterized constructor"+i);
	}
	public Constr1() {
		System.out.println(" we are in default constructor");
	}
	
	public Constr1(String s) {
		System.out.println(" we are in String typed constructor, and my name is, "+s);
	}
	public Constr1(String s,int a) {
		System.out.println(" we are in String typed constructor, and my name is, "+s +a);
	}
	public Constr1(boolean s) {
		System.out.println(" we are in Boolean typed constructor, and are you a human, "+s);
	}
	
	
	public static void main(String[] args) {
		Constr1 c =new Constr1(234562134);
		Constr1 c1 =new Constr1();
		Constr1 c2 =new Constr1("Sravya");
		Constr1 c3 =new Constr1(true);
		Constr1 c4 =new Constr1("endo",98);
		
		
		
	}

	

	
}
