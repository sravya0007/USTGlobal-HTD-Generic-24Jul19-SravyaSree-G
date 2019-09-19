package com.dev.Polynorphism;

public class LateBinding extends EarlyBinding {

	static LateBinding l=new LateBinding();
	@Override
	public void meth() {
		System.out.println("no arg method in      ");
		
			super.meth();
	}

	public static void main(String[] args) {
		l.meth();
	}

}
