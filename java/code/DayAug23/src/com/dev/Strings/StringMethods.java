package com.dev.Strings;

public class StringMethods {

	public static void main(String[] args) {
		
		String str="Nani";
		int a=str.length();
		System.out.println(str+", of length "+a);
		
		char[] ch=str.toCharArray();
		System.out.println(ch[2]);
		System.out.println("Output for charAt()     "+str.charAt(3));
		
		String s=str;
		boolean b=s.equals(str);
		System.out.println("Output for equals()	"+b);
		
		//Equals ignore
		String s1="nanI";
		boolean b1=s1.equalsIgnoreCase(str);
		System.out.println("Output for equalsIgnorecase()	"+b1);
		
		
		
		
		
	}

	

}
