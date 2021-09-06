package Quiz;

import java.util.Scanner;

public class Quiz_09_06_4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Q1();
		// Q2();
		 Q3();
	}

	public static void Q1() {
		int num = Integer.parseInt(sc.nextLine());
		int cnt = 0;

		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				continue;
			} else {
				cnt++;
				System.out.println(i);
			}

		}
		System.out.println(cnt);
	}

	public static void Q2() {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i * j);
			}
		}
	}

	public static void Q3() {
		int num = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.printf("%d ", i * j);
			}
			System.out.println();
		}
	}

}
