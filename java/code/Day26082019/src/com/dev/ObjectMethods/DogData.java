package com.dev.ObjectMethods;

public class DogData {

	public static void main(String[] args) {
		Dog d = new Dog();
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		Dog d4 = new Dog();
		d.setAge(2);
		d.setName("cesor");
		d.setColor("brown");
		d.setBreed("greman shepard");
		d1.setAge(3);
		d1.setName("preethi");
		d1.setColor("white");
		d1.setBreed("Dalmation");
		d2.setAge(4);
		d2.setName("snupy");
		d2.setColor("black");
		d2.setBreed("Doberman");
		d3.setAge(5);
		d3.setName("pink");
		d3.setColor("white");
		d3.setBreed("poddle");
		d4.setAge(5);
		d4.setName("pink");
		d4.setColor("white");
		d4.setBreed("poddle");

		Dog[] dog = { d, d1, d2, d3 };
		for (int i = 0; i < dog.length; i++) {
			
//			System.out.println("name: " + dog[i].getName());
//			System.out.println("age: " + dog[i].getAge());
//			System.out.println("color: " + dog[i].getColor());
//			System.out.println("Breed: " + dog[i].getBreed());
//		
/*toString()*/			System.out.println(dog[i]);
			System.out.println("______________________________________");
		}
		//equals
		System.out.println(d3.equals(d4));
		//hashcode
		System.out.println(d3.hashCode());
		System.out.println(d4.hashCode());
	}
}
