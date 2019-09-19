package com.dev.Strings;

public class StringMethods1 {

	public static void main(String[] args) {
		String s="water is wet";
		String s1="water is dry";
		String s2="water IS DRY";
		String s3=s1;
		
		int sl=s.length();
		System.out.println("length of "+s+" is = "+sl);
		
		char[] ch=s1.toCharArray();
		System.out.println(ch);
		
		System.out.println("Output of charAt()"+s.charAt(1));
		
		boolean n=s.equals(s1);
		System.out.println("Output of equals()"+n);
		
		boolean n1=s1.equalsIgnoreCase(s2);
		System.out.println("Output of equals()"+n1);
		
		boolean n2=s1.contains("is");
		System.out.println("Output of contains()"+n2);
		
		String ss= s1.replace("r", "a");
		System.out.println("Output of replace()"+ss);
		
		int a=s1.indexOf("i");
		System.out.println("Output of indexOf()"+a);
		
		String st=s.toUpperCase();
		System.out.println("Output of toUpperCase()"+st);
		
		
		String st1=s.toLowerCase();
		System.out.println("Output of toLowerCase()"+st1);
		
		String st3=s.substring(11);
		System.out.println("Output of substring()"+st3);
				
		String st2=s.substring(2,12);
		System.out.println("Output of substring()"+st2);
		//the beginning index elements are included but the end index elements are not included
		
		
		
		
		
		
		
		

	}

}
