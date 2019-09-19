package com.dev.threadss;

public class Thread5 extends Thread{
Printer p;
public Thread5 (Printer pref){
	p=pref;
	
}
@Override
	public void run() {
		for (int i = 0; i <=10; i++) {
			System.out.println("j= "+i);
		}

	}
}
