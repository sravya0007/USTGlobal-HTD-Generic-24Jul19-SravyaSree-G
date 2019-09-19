package com.dev.threadss;

public class Printer2 {

	synchronized void printVal(int i,String Thread) {
		for (int j = 0; j < i; j++) {
			System.out.println("thread "+Thread+" "+"j= "+j);
			
		}
	}
}
