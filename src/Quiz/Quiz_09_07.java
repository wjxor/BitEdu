package Quiz;

import java.util.Scanner;

public class Quiz_09_07 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Q1();
		// Q2();
	}

	public static void Q1() {
		int num1 = Integer.parseInt(sc.nextLine());
		int num2 = Integer.parseInt(sc.nextLine());
		int sNum, bNum;
		int sum = 0;
		int cnt = 0;

		sNum = Math.min(num1, num2);
		bNum = Math.max(num1, num2);

		for (int i = sNum; i < bNum; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				sum += i;
				cnt++;
			} else {
				continue;
			}
		}

		double avg = (double) sum / cnt;

		System.out.println("합 : " + sum + "/평균 : " + avg);

	}

	public static void Q2() {
		int num = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}

			System.out.println();
		}

	}

}
