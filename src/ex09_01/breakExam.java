package ex09_01;

public class breakExam {

	public static void main(String[] args) {
		// BreakExample();
		// BreakOutterExample();

	}

	private static void ContinueExample() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}

			System.out.println(i);
		}

	}

	private static void BreakOutterExample() {
		// 'A' - 65
		// 'a' - 97
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter;
				}
			}
		}

		System.out.println("프로그램 실행 종료");
	}

	private static void BreakExample() {
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6) {
				break;
			}
		}

		System.out.println("프로그램 종료");
	}

}
