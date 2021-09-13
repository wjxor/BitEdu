package ex09_13;

import java.util.Scanner;

public class wjxor0913 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Q1();
		Q2();
	}

	// 두개의 정수를 입력받아(x, y) 1~x 까지의 숫자중 y의 배수를 출력하고, 배수의 합을 출력
	// 10, 4 -> 4 8 합 : 12
	public static void Q1() {
		int x = Integer.parseInt(sc.nextLine());
		int y = Integer.parseInt(sc.nextLine());
		int sum = 0;

		for (int i = 1; i <= x; i++) {
			if (i % y == 0) {
				System.out.printf("%d ", i);
				sum += i;

			}
		}

		System.out.printf("\n합 : %d", sum);
	}

	// 정수(num)을 입력받아 1~num까지의 정수 중 소수(1과 자기자신만 약수인것)를 출력하고
	// 소수의 합을 출력
	public static void Q2() {
		int num = Integer.parseInt(sc.nextLine());
		int sum = 0;
		int cnt = 0;

		System.out.print("소수들 : ");
		for (int i = 2; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.printf("%d ", i);
				sum += i;
			}
			cnt = 0;

		}

		System.out.printf("\n합 : %d", sum);

	}
}
