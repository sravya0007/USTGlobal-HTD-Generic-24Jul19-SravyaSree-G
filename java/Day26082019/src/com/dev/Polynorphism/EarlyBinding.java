package com.dev.Polynorphism;

public class EarlyBinding {
	
	static EarlyBinding e=new EarlyBinding();
	public void meth() {
		System.out.println("NO arg method in ovldng");
	}

	public void meth(int i) {
		System.out.println("int arg method in ovldng");
	}

	public void meth(String s) {
		System.out.println("String arg method in ovldng");
	}

	public void meth(int i,String s) {
		System.out.println("int and string arg method in ovldng");
	}

	public static void main(String[] args) {
		e.meth(1);
		e.meth("sravya");
		e.meth(12,"suchii");
		e.meth();
		}

}
