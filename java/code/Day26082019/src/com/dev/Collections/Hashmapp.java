package com.dev.Collections;

import java.util.HashMap;

import com.dev.encapsulation.Dog;

public class Hashmapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <String,Dog> hs=new HashMap<String,Dog>();
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
		
		hs.put("a", d);
		hs.put("aa", d1);
		hs.put("b", d2);
		hs.put("bc", d3);
		System.out.println(hs);
		//
		Dog b=hs.put("b", d1);
		System.out.println(b);
		//remove
		Dog b1=hs.remove("b");
		System.out.println(hs);
		
		//.containskey
		System.out.println(hs.containsKey(d));
		
		
		//.containsvalue

		System.out.println(hs.containsValue(d));
		
	}

}
