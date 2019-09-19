package com.dev.Abstraction;

public class Child3 extends Parent {

	public static void main(String[] args) {
		Child3 c=new Child3();
		c.band();
		c.sand();
	}

	@Override
	void sand() {
		System.out.println("sand in parent from child3");
		
	}

	@Override
	void band() {
		System.out.println("band in parent from child3");
		
	}

}
