package com.dev.threadss;

public class Thread2 extends Thread{

	public void run() 	{
		// TODO Auto-generated method stub
System.out.println("t2 thread strated..");

for(int j=0;j<=10;j++) {
	System.out.println("j= "+j);
}
System.out.println("t2 thread trminated...");
	}

}
