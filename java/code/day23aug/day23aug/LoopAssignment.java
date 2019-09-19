package day23aug;

public class LoopAssignment {

	public static void main(String[] args) {

		int c = 0;
		for (int i = 1; i <= 4; i++) {
			int key = 3;
			for (int j = 1; j <= i; j++) {
				if (j == 1) {
					System.out.print(i);
				} else if (j == 2) {
					System.out.print(" ");
					System.out.print(i + key);
					// key--;
				} else if (j == 3) {
					// key=2;
					System.out.print(" ");
					System.out.print(i + key + 2);
					// key-=2;
				} else if (j == 4) {
					// key=1;
					System.out.print(" ");
					System.out.print(i + key + 3);

					// key-=1;
				}

			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------");

		int st = 1;
		int sp = 4;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print("*");
			}
			if (sp <= 5 / 2 || sp == i - 1) {
				sp++;
				st -= 2;
			} else {
				sp--;
				st += 2;
			}

			System.out.println();
		}
		System.out.println("--------------------------------------------------------------");

		int i = 0;
		int j = 0;

		for (i = 1; i <= 4; i++) {
			for (j = 0; j < i; j++) {
				System.out.print((char) (64 + i + j));
				System.out.print((char) (96 + i + j));
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------");

		st = 1;
		sp = 4;
		int b = 0;

		for (i = 1; i <= 5; i++) {
			for (j = 0; j < sp; j++) {
				System.out.print(" ");
			}
			int a = 64;
			for (int k = 0; k < st; k++) {

				System.out.print((char) (a + i - b + c));

				a++;
			}
			if (sp <= 5 / 2 || sp == i - 1) {
				sp++;
				st -= 2;
				b = 64 - 45;
			} else {
				sp--;
				st += 2;

			}

			System.out.println();

		}

	}

}
