package ex09_01;

public class ForExample {

	public static void main(String[] args) {
		// ForPrintFrom1To10Example();
		// ForSumFrom1To100Example1();
		// ForSumFrom1To100Example2();
		// ForFloatCounterExample();
		ForMultiplicationTableExample();
	}

	private static void ForMultiplicationTableExample() {
		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " == " + (m * n));
			}
		}
	}

	private static void ForFloatCounterExample() {
		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
	}

	// 1부터 100까지의 합
	private static void ForSumFrom1To100Example2() {
		int sum = 0;

		int i = 0;
		for (i = 1; i <= 100; i++) {
			sum += i;
		}

		System.out.println("1~" + (i - 1) + " 합 : " + sum);
	}

	// 1부터 10까지 출력
	private static void ForPrintFrom1To10Example() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	// 1부터 100까지의 합
	private static void ForSumFrom1To100Example1() {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		System.out.println(sum);
	}

}
