package Quiz;

import java.util.Scanner;

public class Quiz_09_01 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// SumOfOddEven();
		// MultipleTF();
		// Cost();
		// Day();
		// tri1();
		tri2();
		// tri3();
		// tri4();
	}

	// 1부터 입력받은 숫자까지의 짝수와 홀수의 합을 출력
	private static void SumOfOddEven() {
		int cnt = Integer.parseInt(sc.nextLine());
		int ESum = 0, OSum = 0;

		for (int i = 1; i <= cnt; i++) {
			if (i % 2 == 0) {
				ESum += i;
			} else {
				OSum += i;
			}
		}

		System.out.println("짝수의 합 : " + ESum);
		System.out.println("홀수의 합 : " + OSum);
	}

	// 수를 입력받아 5의 배수인지 아닌지를 출력해주는 프로그램 생성
	private static void MultipleTF() {
		int num = Integer.parseInt(sc.nextLine());

		if (num % 5 == 0) {
			System.out.println("5의 배수다.");
		} else {
			System.out.println("5의 배수가 아니다.");
		}

	}

	// 과자의 개당 가격은 2000원이다.
	// 10개 초과하면 개당 1500원의 가격으로 과자를 구매할 수 있다.
	// 과자의 갯수를 입력받아 금액을 출력
	private static void Cost() {
		int cnt = Integer.parseInt(sc.nextLine());

		int snack = 2000;

		if (cnt > 10) {
			snack = 1500;
		}

		System.out.println("과자의 가격은 : " + snack * cnt);
	}

	// 1~7까지의 숫자를 받아서 1일이면 '월', 2일이면 '화', 3일이면 '수', ...
	private static void Day() {
		int num = Integer.parseInt(sc.nextLine());

		switch (num) {
		case 1:
			System.out.println("월");
			break;
		case 2:
			System.out.println("화");
			break;
		case 3:
			System.out.println("수");
			break;
		case 4:
			System.out.println("목");
			break;
		case 5:
			System.out.println("금");
			break;
		case 6:
			System.out.println("토");
			break;
		default:
			System.out.println("일");
		}
	}

	/*
	 *
	 **
	 ***
	 ****
	*/
	private static void tri1() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/*
	 ****
	 ***
	 **
	 *
	*/
	private static void tri2() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/*
	    *
	   **
	  ***
	 ****
	*/
	private static void tri3() {
		for (int i = 0; i < 6; i++) {
			for (int j = 5; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else
					System.out.print("*");
			}
			System.out.println();
		}
	}

	/*
	****
	 ***
	  **
	   * 
	*/
	private static void tri4() {
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i < j) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
