package com.dev.Exceptions;



public class DogData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Eimpl e= new Eimpl();
		Dog d=new Dog();
		Dog d1=new Dog();
		Dog d2=new Dog();
		Dog d3=new Dog();
		d.setAge(2);
		d.setName("cesor");
		d.setColor("brown");
		d.setBreed("greman shepard");
		d3.setAge(2);
		d3.setName("cesor");
		d3.setColor("brown");
		d3.setBreed("greman shepard");
		d1.setAge(3);
		d1.setName("preethi");
		d1.setColor("white");
		d1.setBreed("Dalmation");
		d2.setAge(4);
		d2.setName("snupy");
		d2.setColor("black");
		d2.setBreed("Doberman");
		boolean b=e.addDog(d);
		System.out.println("for adding"+b);
		e.getDog(d3);
		

	}

}
