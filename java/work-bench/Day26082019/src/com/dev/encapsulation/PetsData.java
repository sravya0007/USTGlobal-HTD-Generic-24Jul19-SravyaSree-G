package com.dev.encapsulation;

public class PetsData {

	final static int I=12;
	public static void main(String[] args) {
		//I=20;  cant reinitialize the FINAL Variable
		Pets p1=new Pets();
		Pets p2=new Pets();
		Pets p3=new Pets();
		Pets p4=new Pets();
		Pets p5=new Pets();
		Pets p6=new Pets();
		p1.setAge(1);
		p1.setName("kokoo");
		p1.setType("parrots");
		p1.setColor("rED");
		
		p2.setAge(3);
		p2.setName("SQUEEZY");
		p2.setType("CAt");
		p2.setColor("black");
		
		p3.setAge(5);
		p3.setName("choclate");
		p3.setType("pug");
		p3.setColor("brown");
		
		p4.setAge(6);
		p4.setName("noodle");
		p4.setType("snake");
		p4.setColor("green");
		
		p5.setAge(12);
		p5.setName("chopp");
		p5.setType("pig");
		p5.setColor("pink");
		
		p6.setAge(2);
		p6.setName("saint");
		p6.setType("MOnkey");
		p6.setColor("white");
		Pets []p= {p1,p2,p3,p4,p5,p6};
		for(int i=0;i<p.length;i++) {
			System.out.println("name: "+p[i].getName());
			System.out.println("age: "+p[i].getAge());
			System.out.println("color: "+p[i].getColor());
			System.out.println("Breed: "+p[i].getType());
			System.out.println("______________________________________");
		}
		
	}

}
