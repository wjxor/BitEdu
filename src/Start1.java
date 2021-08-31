import java.util.Scanner;

// Start1.java
public class Start1 {

	public static Scanner sc = new Scanner(System.in);

	// 사용자로부터 정수 2개를 입력받고 출력
	public static void Exam1() {
		int num1, num2;

		System.out.println("정수 입력 : ");
		num1 = Integer.parseInt(sc.nextLine());

		System.out.println("정수 입력 : ");
		num2 = Integer.parseInt(sc.nextLine());

		System.out.println("입력된 정수 : " + num1);
		System.out.println("입력된 정수 : " + num2);
	}

	// 사용자로부터 정수 1개와 실수 1개를 입력받고 출력
	// 실수타입 : float
	// 입력 : Float.pareInt(문자열);
	public static void Exam2() {
		int num1;
		float num2;

		System.out.print("정수 입력 : ");
		num1 = Integer.parseInt(sc.nextLine());

		System.out.print("실수 입력 : ");
		num2 = Float.parseFloat(sc.nextLine());

		System.out.println("입력된 정수 : " + num1);
		System.out.println("입력된 실수 : " + num2);
	}

	// 사용자로부터 정수 2개를 입력받아 합의 결과를 출력
	public static void Exam3() {
		int num1, num2;

		System.out.print("정수 입력 : ");
		num1 = Integer.parseInt(sc.nextLine());

		System.out.print("정수 입력 : ");
		num2 = Integer.parseInt(sc.nextLine());

		System.out.printf("합 : %d", num1 + num2);
	}

	// 사용자로부터 실수 2개를 입력받아 합의 결과를 출력
	public static void Exam4() {
		float fnum1, fnum2;

		System.out.print("첫번쨰 실수 입력 : ");
		fnum1 = Float.parseFloat(sc.nextLine());

		System.out.print("두번쨰 실수 입력 : ");
		fnum2 = Float.parseFloat(sc.nextLine());

		System.out.printf("합 : %.1f", fnum1 + fnum2);
	}

	public static void main(String[] args) {
		Exam4();
	}
}
