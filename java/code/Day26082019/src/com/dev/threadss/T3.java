package com.dev.threadss;

public class T3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("t3 thread strated..");

		for(int j=0;j<=10;j++) {
			System.out.println("k= "+j);
		}
		System.out.println("t3 thread trminated...");

		
	}

	
}
