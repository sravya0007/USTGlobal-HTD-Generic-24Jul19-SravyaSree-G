package com.dev.Abstraction;

public class Childd extends Child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childd c=new Childd()
;
		c.air();
		c.sea();
		c.sand();
	}

	

	@Override
	void sea() {
		System.out.println("sea in childd from child1");
		
	}



	@Override
	void band() {
		System.out.println("band in childd from parent");
		
	}

}
