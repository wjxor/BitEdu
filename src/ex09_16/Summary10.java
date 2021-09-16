package ex09_16;

import java.util.Scanner;

public class Summary10 {
	public static void main(String[] args) {
		// 10장 예외처리
		// 오류의 종류 - 에러, 예외
		// 하드웨어 -> 에러 -> 프로그램 종료
		// 사람 실수 -> 예외 -> 프로그램 종료
		// 사람 실수 -> 예외처리 -> 종료되지 않음

		// 예외에 대해 다양한 클래스 제공 -> 너무 다양해서 외우긴 무리
		// *** 최상위 클래스 Exception

		int[] int_arr = new int[3];
		// 예외 처리 방법
		try { // 예외가 발생할 수 있는 코드
			int_arr[4] = 10;
		} catch (Exception e) { // 예외가 발생했을때 처리
			// 일반적으로 사용
			System.out.println(e.toString()); // 예외의 내용
			e.printStackTrace(); // 예외의 위치
			System.out.println("예외 발생");
		} finally { // 파이널 - 항상 실행
			System.out.println("finally");
		}

		System.out.println("프로그램 다음실행");

		int[] intarr = new int[3];

		try {
			intarr[4] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		} catch (Exception e) {
			System.out.println("위에 명시된 예외를 제외한 모든 예외");
		}
	}

	static void print() throws Exception {
		System.out.println("1~10의 정수 입력");
		Scanner sc = new Scanner(System.in);

		int num = Integer.parseInt(sc.nextLine());

		if (num >= 1 && num <= 10) {
			System.out.println("정상작동");
		} else {
			System.out.println("개발자의도를 빗나감");
			throw new Exception();
		}
	}

}
