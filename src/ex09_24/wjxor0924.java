package ex09_24;

import java.util.Scanner;
import java.util.Stack;

public class wjxor0924 {
	static Stack<String> stackb = new Stack<String>();
	static Stack<String> stackf = new Stack<String>();

	public static void main(String[] args) {
		//Q1();
		// Q2();
		 Q3();
	}

	static void Q1() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		int size = stack.size();

		for (int i = 0; i < size; i++) {
			System.out.println(stack.pop());
		}

	}

	static void Q2() {
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < 5; i++) {
			stack.push(i + 1);
		}

		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

	static void Q3() {
		System.out.println("1. 페이지 방문 | 2. 이전페이지 | 3. 다음페이지 | 4. 종료");

		Scanner sc = new Scanner(System.in);
		Stack<String> previous = new Stack<String>();
		Stack<String> next = new Stack<String>();

		String now_page = "구글";

		boolean isrun = true;
		while (isrun) {
			int num = Integer.parseInt(sc.nextLine());

			switch (num) {
			case 1:
				System.out.println("방문할 페이지 : ");
				String page = sc.nextLine();
				previous.push(now_page);
				now_page = page;
				System.out.println("현재페이지 : " + now_page);
				break;
			case 2:
				if (previous.isEmpty()) {
					System.out.println("이전페이지가 없습니다.");
					break;
				}

				String page2 = previous.pop();
				next.push(now_page);
				now_page = page2;
				System.out.println("현재페이지 : " + now_page);
				break;
			case 3:
				if (next.isEmpty()) {
					System.out.println("다음페이지가 없습니다.");
					break;
				}

				previous.push(now_page);
				now_page = next.pop();
				System.out.println("현재페이지 : " + now_page);
				break;
			case 4:
				isrun = false;
				break;
			}
		}
		System.out.println("방문할 페이지 : ");
		String page = sc.nextLine();

	}

}
