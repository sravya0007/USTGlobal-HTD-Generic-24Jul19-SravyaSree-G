package com.dev.Inheritance;

public class Outdoor extends Sports{

static Outdoor o=new Outdoor();
	
	String type="Outdoor";
	String motto="outdoor games"
			+ " are joyful";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		o.printName();
		
}
		
		public void printName() {
			
			System.out.println("type is "+type+", "+super.motto);
		
	}

}
