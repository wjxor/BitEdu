import java.util.Scanner;

// 두 수를 입력받아 사칙연산
public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println(name);

	}

	// 반환 없을때는 void 타임
	private static int Add(int a, int b) {
		return a + b;
	}

	private static int Sub(int a, int b) {
		return a - b;
	}

	private static int Mul(int a, int b) {
		return a * b;
	}

	private static double Div(int a, double b) {
		if (b == 0) {
			return 0;
		}

		return a / (double) b;
	}

}
