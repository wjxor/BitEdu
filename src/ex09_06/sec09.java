package ex09_06;

public class sec09 {
	public static void main(String[] args) {
		int result1 = Calculator.plus(5, 3);
		double result2 = Calculator.pi;

		System.out.println(result1);
		System.out.println(result2);

		Calculator cal = new Calculator();
		int result3 = cal.minus(5, 3);
		System.out.println(result3);
	}
}

class Calculator {
	static double pi = 3.14159;

	static int plus(int x, int y) {
		return x + y;
	}

	int minus(int x, int y) {
		return x - y;
	}
}