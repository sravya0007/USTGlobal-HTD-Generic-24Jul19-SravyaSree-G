package com.dev.Inheritance;

public class Sports {
static Sports s=new Sports();
	
	String motto="Stay fit stay healthy";
	String type="Sports";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s.printName();
		
}
		
		public void printName() {
			
			System.out.println(type+"-> "+s.motto);
		
	}

}
