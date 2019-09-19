package com.dev.Const;

public class ConstMethod {


		
			public ConstMethod(int i) {
				System.out.println("we are in parameterized constructor"+i);
			}
			public ConstMethod() {
				System.out.println(" we are in default constructor");
			}
			
			public ConstMethod(String s) {
				System.out.println(" we are in String typed constructor, and my name is, "+s);
			}
			public ConstMethod(String s,int a) {
				System.out.println(" we are in String typed constructor, and my name is, "+s +a);
			}

			//Using three parameters
			public ConstMethod(int a,int b,int c) {
				System.out.println("displaying numbers a= "+a+" ,b="+b+" ,c="+c);
			}

			//Using four parameters
			public ConstMethod(int a,int b,int c,int d) {
				System.out.println("displaying numbers a= "+a+" ,b="+b+" ,c="+c+" ,d="+d);
			}
			
			
			public static void main(String[] args) {
				ConstMethod c =new ConstMethod(234562134);
				ConstMethod c1 =new ConstMethod();
				ConstMethod c2 =new ConstMethod("Sravya");
				ConstMethod c3 =new ConstMethod(1,3,4);
				ConstMethod c4 =new ConstMethod(13,49,52,100);
				ConstMethod c5=new ConstMethod("endo",98);
				
				
				
			}

			

			
		}


	
