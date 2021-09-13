package ex09_13;

import java.util.Scanner;

public class sec14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		prime(sc.nextInt());
	}

	private static void prime(int num) {
		if (num < 2) {
			System.out.println("소수가 아니다.");
			return;
		} else {
			if (num == 2) {
				System.out.println("소수다.");
				return;
			}

			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					System.out.println("소수다.");
					return;
				}
			}

			System.out.println("소수가 아니다.");
		}

	}
}
