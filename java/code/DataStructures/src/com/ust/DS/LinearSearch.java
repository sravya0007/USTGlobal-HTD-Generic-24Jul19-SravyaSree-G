package com.ust.DS;

import java.util.*;

public class LinearSearch {
	static boolean f;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a[] = { 12, 34, 5, 6, 7, 8, 19, 10, 99 };
		System.out.println(LinearSearch(a, 34));

	}

	public static boolean LinearSearch(int a[], int i) {
		// TODO Auto-generated method stub
		for (int i1 = 0; i1 < a.length; i1++) {
			if (i == a[i1]) {
				return true;
			}

		}
		return false;
	}

}
