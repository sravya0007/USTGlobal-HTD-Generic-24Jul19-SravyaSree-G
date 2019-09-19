package com.dev.Abstraction;

public abstract class Child extends Parent{
	void air() {
		System.out.println("air in child");
		
	}
	abstract void sea();
	
	@Override
	void sand() {
		System.out.println("Sand in child from parent");
	}
	
	
	
}
