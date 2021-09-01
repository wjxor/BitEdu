package ex09_01;

import java.util.Scanner;

public class sec05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. if, 2. switch");

		int num = Integer.parseInt(sc.nextLine());

		if (num == 1) {
			System.out.println("num은 1이다");
			System.out.println("계좌관리 프로그램");
			System.out.println("1. 계좌생성, 2. 계좌삭제, 3. 입금, 4. 출금, 5. 계좌조회");

			int num2 = Integer.parseInt(sc.nextLine());

			if (num2 == 1) {
				System.out.println("계좌생성");
			}

			else if (num2 == 2) {
				System.out.println("계좌삭제");
			}

			else if (num2 == 3) {
				System.out.println("입금");
			}

			else if (num2 == 4) {
				System.out.println("출금");
			}

			else {
				System.out.println("계좌조회");
			}
		}

		else {
			System.out.println("num은 1이 아니다");
			System.out.println("switch");
		}

	}

}
