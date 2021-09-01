package ex09_01;

import java.util.Scanner;

public class sec06 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// for_test();
		// while_test();
		// while_test2();
		// doWhile_test();
		// break_test();
		break_test2();
	}

	private static void continue_test() {
		int cnt = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= cnt; i++) {
			if (i % 2 != 0) {
				continue;
			}

			System.out.println(i);
		}
	}

	private static void break_test() {
		int cnt = Integer.parseInt(sc.nextLine());
		int result = 0;

		for (int i = 1; i <= cnt; i++) {
			result += i;

			if (result >= 5) {
				break;
			}
		}

		System.out.println(result);
	}

	private static void break_test2() {
		int cnt = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= cnt; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

				if (j == 3) {
					break;
				}
			}
			System.out.println();
		}
	}

	private static void while_test2() {
		boolean boolean_val = true;
		while (true) {
			System.out.println("1. 계좌생성, 2. 계좌삭제, 3. 종료");
			int num = Integer.parseInt(sc.nextLine());

			switch (num) {
			case 1:
				System.out.println("계좌생성");
				break;
			case 2:
				System.out.println("계좌삭제");
				break;
			default:
				System.out.println("종료");
				boolean_val = false;
			}
		}
	}

	private static void while_test() {
		int cnt = Integer.parseInt(sc.nextLine());
		int i = 1, result = 0;

		while (i <= cnt) {
			System.out.println(i);
			result += i;
			i++;
		}

		System.out.println(result);

		while (true) {

		}
	}

	private static void for_test() {
		int cnt = Integer.parseInt(sc.nextLine()); // 반복횟수
		int result = 0;

		for (int i = 1; i <= cnt; i++) {
			System.out.println(i);
			result += i;
		}

		System.out.println("1부터 " + cnt + "까지의 합 : " + result);
	}

	private static void doWhile_test() {
		int cnt = Integer.parseInt(sc.nextLine());
		int i = 1, result = 0;
		do {
			System.out.println(i);
			result += i;
			i++;
		} while (i <= cnt);

		System.out.println(result);
	}

}
