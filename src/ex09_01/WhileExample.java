package ex09_01;

import java.io.IOException;
import java.util.Scanner;

public class WhileExample {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// WhilePrintFrom1To10Example();
		// WhileSumFrom1To100Example();
		// WhilekeyControlExample();
		// DoWhileExample();
	}

	private static void WhilekeyControlExample() throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("-------------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("-------------------------");
				System.out.println("선택 : ");
			}
			keyCode = System.in.read();

			if (keyCode == 49) {
				speed++;
				System.out.println("현재 속도 =" + speed);
			} else if (keyCode == 50) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if (keyCode == 51) {
				run = false;
			}

		}

		System.out.println("프로그램 종료");
	}

	private static void WhilePrintFrom1To10Example() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}

	private static void WhileSumFrom1To100Example() {

		int sum = 0;

		int i = 1;

		while (i <= 100) {
			sum += i;
			i++;
		}

		System.out.println("1~" + (i - 1) + " 합 : " + sum);
	}

	private static void DoWhileExample() {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");

		String inputString;

		do {
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));

		System.out.println();
		System.out.println("프로그램 종료");
	}

}
