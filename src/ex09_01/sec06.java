package ex09_01;

import java.util.Scanner;

public class sec06 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		for_test();
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

}
