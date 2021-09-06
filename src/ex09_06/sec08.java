package ex09_06;

public class sec08 {

	public static void main(String[] args) {
		Cal cal = new Cal();
		int result = cal.Plus(5, 5);
		float result3 = cal.Plus(3.1f, 5.5f);
		int result4 = cal.Plus(1, 2, 3, 4);

	}

}

class Cal {
	// 메소드 오버로딩
	int Plus(int a, int b) {
		return a + b;
	}

	float Plus(float a, float b) {
		return a + b;
	}

	int Plus(int a, int b, int c, int d) {
		return a + b + c + d;
	}
}