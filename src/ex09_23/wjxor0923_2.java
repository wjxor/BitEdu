package ex09_23;

import java.util.Scanner;

public class wjxor0923_2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Q1();
		// Q2();
		// Q3();

	}

	static void Q1() { // 팩토리얼
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		System.out.println((factorial(num)));
	}

	static void Q2() { // 거듭제곱
		System.out.print("x 입력 : ");
		int x = sc.nextInt();
		System.out.print("y 입력 : ");
		int y = sc.nextInt();
		System.out.println((power(x, y)));
	}

	static void Q3() { // 피보나치
		for (int i = 1; i <= 10; i++) {
			System.out.println(fibo(i));
		}
	}

	public static int factorial(int n) {
		if (n <= 1) {
			return n;
		} else {
			return factorial(n - 1) * n;
		}
	}

	public static int power(int x, int y) {
		if (y > 0) {
			return (int) Math.pow(x, y);
		} else {
			return x;
		}
	}

	public static int fibo(int n) {
		if (n <= 1) {
			return n;
		}

		else {
			return fibo(n - 2) + fibo(n - 1);
		}

	}

}
