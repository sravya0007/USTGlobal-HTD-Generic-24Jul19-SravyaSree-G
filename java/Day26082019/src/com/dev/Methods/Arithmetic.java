package com.dev.Methods;

import java.util.Scanner;

public class Arithmetic {
	public static int add(int i, int j, int k, int l) {
		int s = i + j + k + l;
		System.out.println("addition of" + i + "," + j + "," + k + "," + l + " is = " + s);
		System.exit(0);
		return 1;

	}

	public static int add(int i, int j, int k) {
		int s = i + j + k;
		System.out.println("addition of" + i + "," + j + "," + k + " is = " + s);
		System.exit(0);
		return s;

	}

	public static int add(int i, int j) {
		int s = i + j;
		System.out.println("addition of" + i + "," + j + " is = " + s);
		System.exit(0);
		return s;

	}

//=====================================================================================================
	public static int sub(int i, int j, int k, int l) {
		int s = i - j - k - l;
		System.out.println("Subtraction of" + i + "," + j + "," + k + "," + l + "l" + " is = " + s);
		System.exit(0);
		return s;

	}

	public static int sub(int i, int j, int k) {
		int s = i - j - k;
		System.out.println("Subtraction of" + i + "," + j + "," + k + " is = " + s);
		System.exit(0);
		return s;

	}

	public static int sub(int i, int j) {
		int s = i - j;
		System.out.println("Subtraction of" + i + "," + j + " is = " + s);
		System.exit(0);
		return s;

	}

	// =========================================================================================
	public static int mul(int i, int j, int k, int l) {
		int s = i * j * k * l;
		System.out.println("multiplication of" + i + "," + j + "," + k + "," + l + "l" + " is = " + s);
		System.exit(0);
		return s;

	}

	public static int mul(int i, int j, int k) {
		int s = i * j * k;
		System.out.println("multiplication of" + i + "," + j + "," + k + " is = " + s);
		System.exit(0);
		return s;

	}

	public static int mul(int i, int j) {
		int s = i * j;
		System.out.println("multiplication of" + i + "," + j + " is = " + s);
		System.exit(0);
		return s;

	}

	// =========================================================================================================
	public static int div(int i, int j, int k, int l) {
		int s = i / j / k / l;
		System.out.println("division of" + i + "," + j + "," + k + "," + l + "l" + " is = " + s);
		System.exit(0);
		return s;

	}

	public static int div(int i, int j, int k) {
		int s = i / j / k;
		System.out.println("division of" + i + "," + j + "," + k + " is = " + s);
		System.exit(0);
		return s;

	}

	public static int div(int i, int j) {
		int s = i / j;
		System.out.println("division of" + i + "," + j + " is = " + s);
		System.exit(0);
		return s;

	}
	// ========================================================================================

	public static int mod(int i, int j) {
		int s = i % j;
		System.out.println("Modulodivision of" + i + "," + j + " is = " + s);
		System.exit(0);
		return s;

	}

	// ========================================================================================
	public static void main(String[] args) {
		Arithmetic a = new Arithmetic();
		int i = 0, j = 0;
		int b, c, d, e;
		Scanner s = new Scanner(System.in);
		System.out.println("enter your choice");
		System.out.println("add");
		System.out.println("sub");
		System.out.println("mul");
		System.out.println("div");
		System.out.println("mod");
		i = s.nextInt();
		switch (i) {
		case 1: {

			System.out.println("no.of elements you have to enter:");
			System.out.println("Enter 2 or 3 or 4");
			j = s.nextInt();
			if (j == 2 || j == 3 || j == 4) {

				switch (j) {
				case 2: {
					System.out.println("enter values");
					b = s.nextInt();
					c = s.nextInt();
					add(b, c);
					
				}break;

				case 3: {
					System.out.println("enter values");
					b = s.nextInt();
					c = s.nextInt();
					d = s.nextInt();
					add(b, c, d);
				}break;


				case 4: {
					System.out.println("enter values");
					b = s.nextInt();
					c = s.nextInt();
					d = s.nextInt();
					e = s.nextInt();
					add(b, c, d, e);
					
				}break;
				default:
					break;

				}

			}
		}

		// ===========================================
		case 2: {

			System.out.println("no.of elements you have to enter:");
			System.out.println("Enter 2 or 3 or 4");
			j = s.nextInt();
			if (j == 2 || j == 3 || j == 4) {

				switch (j) {
				case 2: {
					System.out.println("enter values");
					b = s.nextInt();
					c = s.nextInt();
					sub(b, c);
					

				}break;
				case 3: {
					System.out.println("enter values");
					b = s.nextInt();
					c = s.nextInt();
					d = s.nextInt();
					sub(b, c, d);
					

				}break;
				case 4: {
					System.out.println("enter values");
					b = s.nextInt();
					c = s.nextInt();
					d = s.nextInt();
					e = s.nextInt();
					sub(b, c, d, e);
					

				}break;
				default:
					break;

				}

			}
		}

		// =============================================
		case 3: {

			System.out.println("no.of elements you have to enter:");
			System.out.println("Enter 2 or 3 or 4");
			j = s.nextInt();
			if (j == 2 || j == 3 || j == 4) {

				switch (j) {
				case 2: {
					System.out.println("enter values");
					b = s.nextInt();
					c = s.nextInt();
					mul(b, c);
					

				}break;
				case 3: {
					System.out.println("enter values");
					b = s.nextInt();
					c = s.nextInt();
					d = s.nextInt();
					mul(b, c, d);
					

				}break;
				case 4: {
					System.out.println("enter values");
					b = s.nextInt();
					c = s.nextInt();
					d = s.nextInt();
					e = s.nextInt();
					mul(b, c, d, e);
					
				}break;
				default:
					break;

				}

			}
		}

		// ====================================================
		case 4: {

			System.out.println("no.of elements you have to enter:");
			System.out.println("Enter 2 or 3 or 4");
			j = s.nextInt();
			if (j == 2 || j == 3 || j == 4) {

				switch (j) {
				case 2: {
					System.out.println("enter values");
					b = s.nextInt();
					c = s.nextInt();
					div(b, c);
					
				}break;
				case 3: {
					System.out.println("enter values");
					b = s.nextInt();
					c = s.nextInt();
					d = s.nextInt();
					div(b, c, d);
					

				}break;
				case 4: {
					System.out.println("enter values");
					b = s.nextInt();
					c = s.nextInt();
					d = s.nextInt();
					e = s.nextInt();
					div(b, c, d, e);
					

				}break;
				default:
					break;

				}

			}
		}

//=======================================================
		case 5: {
			System.out.println("enter the two values");
			b = s.nextInt();
			c = s.nextInt();
			mod(b, c);
			

		}break;
		default:
			System.exit(0);

		}

	}
}
