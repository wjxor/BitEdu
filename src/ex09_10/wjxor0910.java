package ex09_10;

import java.util.Random;
import java.util.Scanner;

public class wjxor0910 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Random rd = new Random();
		int num = rd.nextInt(100) + 1;
		int cnt = 10;

		loop: while (true) {
			System.out.print("숫자를 입력하세요 : ");
			int input = sc.nextInt();
			cnt--;

			if (num > input) {
				System.out.println("Up 남은기회 : " + cnt);
			} else if (num < input) {
				System.out.println("Down 남은기회 : " + cnt);
			} else {
				System.out.println("정답입니다.");
				System.out.println("랜덤수는 " + num + "이었습니다.");
				System.out.println("게임을 종료합니다.");
				break;
			}

			if (cnt == 0) {
				System.out.println("게임이 끝났습니다.");
				System.out.println("1. 프로그램 종료, 2. 다시도전?");

				retry: while (true) {
					int endNum = sc.nextInt();
					if (endNum == 1) {
						System.out.println("프로그램이 종료됩니다.");
						break loop;
					} else if (endNum == 2) {
						while (true) {
							System.out.println("정말로 다시 도전하시겠습니까? Y or N");
							char retry = sc.next().charAt(0);

							if (retry == 'Y' || retry == 'y') {
								cnt = 10;
								num = rd.nextInt(100) + 1;
								break retry;
							} else if (retry == 'N' || retry == 'n') {
								System.out.println("프로그램이 종료됩니다.");
								break loop;
							} else {
								System.out.println("Y나 N만 입력해주세요.");
							}
						}
					} else {
						System.out.println("1과 2만 입력해주세요.");
					}
				}
			}
		}
	}
}
