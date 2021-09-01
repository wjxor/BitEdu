package ex09_01;

public class ForExample {

	public static void main(String[] args) {
		// ForPrintFrom1To10Example();
		ForSumFrom1To100Example();
	}

	// 1부터 10까지 출력
	private static void ForPrintFrom1To10Example() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	// 1부터 100까지의 합
	private static void ForSumFrom1To100Example() {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		System.out.println(sum);
	}

}
