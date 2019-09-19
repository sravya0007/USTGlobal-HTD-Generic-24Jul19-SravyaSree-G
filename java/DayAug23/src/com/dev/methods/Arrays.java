package com.dev.methods;

import java.util.*;

public class Arrays {

	public static void main(String[] args) {
		int[] intArr = { 12, 11, 34, 13, 43, 7, 7, 8, 9, 19, 10, 20, 30, 40, 50, 66, 77, 80, 90, 100, 110, 120 };
		System.out.println(intArr.length);
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index value");
		n = sc.nextInt();
		int flag = 0;
		for (int i = 0; i < intArr.length; i++) {

			if (i == n) {

				System.out.println("Index present");
				System.out.println(intArr[i]);

			}
			if (i != n) {
				flag = 1;
			}

		}
		if (flag == 1) {
			System.out.println("Index not present");
			}
			System.out.println("Enter the index value");
		
		flag=0;
			int n1 = sc.nextInt();
			if (n1<=intArr.length) {
				System.out.println("Index present");
				for (int i = 0; i <=  n1; i++) 
				System.out.println(intArr[i]);
			}
			else {
					flag = 1;
				 }

			
			if (flag == 1) {
				System.out.println("Index not present");
			}

		}

	}

