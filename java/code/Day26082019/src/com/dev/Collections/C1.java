package com.dev.Collections;
import java.util.HashSet;
import com.dev.encapsulation.Dog;

public class C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Dog> hs=new HashSet<Dog>();
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
		
		boolean b=hs.add(d);
		boolean b3=hs.add(d3);
		 boolean b1=hs.add(d1);
		 boolean b2=hs.add(d2);
		 System.out.println("output of add=" +b+" "+b1+" "+b2+" "+b3);
		 System.out.println(hs);
		 System.out.println("size of hashset hs:"+ hs.size());
 
		 boolean b4=hs.contains(d1);
		 System.out.println("contains of hashset hs:"+ hs.contains(d));
			 

	}
}