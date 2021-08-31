package ex08_31;

public class sec03_1 {

	public static void main(String[] args) {
		System.out.println("산술 연산자");
		float float_val = 3f / 2f;
		System.out.println(float_val);
		int int_val = 3 / 2;
		System.out.println(int_val);

		double double_val = 3 / 2;
		System.out.println(double_val);
		double double_val2 = 3 / 2d;
		double double_val3 = 3 / (double) 2;
		System.out.println(double_val2);
		System.out.println(double_val3);

		// int int_val2 = 3 / 0; // 실행 에러 -> 산술예외(오류)

		// 나머지
		System.out.println("나머지연산 예제");
		int a = 5, b = 3;
		int c = a % b;
		System.out.println(c);

		// 주의
		// - 0, 0.0으로 나머지를 구하면 에러가 아님 -> 필터링 필요
		// NaN : Not a Number 3%0.0
		// Infinity 3/0.0
		System.out.println(1 % 0.0);
		System.out.println(1 / 0.0);

		// 문자열 연산자(+)
		// 문자열 결합
		System.out.println("문자열 연산자");
		String str = "문자열" + "이어붙이기 + 숫자" + 6 + "실수" + 6.0 + ' ' + 'a';
		// 문자열이어붙이기 + 숫자6실수6.0 a
		System.out.println(str);

		// 비교 연산자 ==, !=, <, >, <=, >=
		System.out.println("비교 연산자");
		boolean b_val = 3 == 4;
		System.out.println(b_val);
		int i_val = 3;
		boolean b_val2 = i_val != 4;
		System.out.println(b_val2);
		boolean b_val3 = "강사는" == "잘생겼다";
		boolean b_val4 = "일치" == "일치";
		System.out.println(b_val3);
		System.out.println(b_val4);

		// 논리 연산자 &&, ||, ^, !, &, |
		// 피연산자가 boolean타입
		// AND(논리곱)&&, OR(논리합)||, XOR(베타적 논리합)^, NOT(논리부정)!
		// 둘 다 참 -> 참, 둘 중 하나이상 참 -> 참, 둘 중 하나만 참 -> 참, 반전
		// && 앞의 피연산자가 false이면 뒤의 연산을 하지 않는다.
		// &는 무조건 둘 다 연산한다.
		System.out.println("논리연산자");
		// page93

		// 비트 연산자
		// ||
		// 비트 논리 연산자(&, |, ^, ~)와 비트 이동 연산자(<<, >>, >>>)

		// 비트 논리 연산자(&, |, ^, ~)
		// 피연산자가 정수타입
		// 일반 논리연산자와 비슷한 개념, true, false 대신 1과 0을 사용
		System.out.println("비트 논리 연산자");
		int i_val1 = 45;
		int i_val2 = 25;
		int r_result = i_val1 & i_val2;

		String binaryString1 = Integer.toBinaryString(i_val1);
		System.out.println(binaryString1);
		// 101101

		String binaryString2 = Integer.toBinaryString(i_val2);
		System.out.println(binaryString2);
		// 011001

		// i_val1 = 101101
		// i_val2 = 011001
		// 001001 -> 9
		System.out.println(r_result);

		int r_result2 = i_val1 | i_val2;
		// i_val1 = 101101
		// i_val2 = 011001
		// 111101 -> 61
		System.out.println(r_result2);

		// 비트 이동 연산자(<<, >>, >>>)
		// 좌측 이동 <<
		// 좌변의 각 비트를 우변만큼 왼쪽으로 이동, 빈자리는 0으로 채운다.
		System.out.println("비트 이동 연산자");
		int result = 2 << 2;
		// 00000010
		// 00001000 -> 8
		System.out.println(result);

		int result2 = 2 << 34; // int는 32bit <<32는 자기자리(한바퀴 돌아서 온다)
		System.out.println(result2);

		// 우측 이동 >>
		// 좌변의 각 비트를 우변만큼 오른쪽으로 이동, 빈자리는 최상위부호비트값
		int result3 = -8 >> 1;
		// 1. 음수 2진수로 만들기
		// 00001000 -> 8의 2진수
		// 2. ~연산 -> 반전시킴
		// 11110111
		// 3. +1 해준다
		// 11111000 -> -8의 2진수
		// 11111100 -> 음수 2진수 -> 10진수
		// 1, 2, 3 역순으로 2진수 -> 부호는 -를 붙인다.
		// ㄱ. -1
		// 11111011
		// ㄴ. ~연산 -> 반전
		// 00000100 -> 4
		// ㄷ. 부호
		// -4
		System.out.println(result3);

		// 우측 이동 >>>
		// 좌변의 각비트를 우변 만큼 오른쪽으로 이동, 빈자리 0으로 채움
		int result4 = -8 >>> 1;
		// 00000000 00000000 00000000 00001000 -> 8
		// 반전
		// 11111111 11111111 11111111 11110111
		// +1
		// 11111111 11111111 11111111 11111000
		// 01111111 11111111 11111111 1111100 -> 정수
		System.out.println(result4);

		// 대입 연산자
		// 단순 대입 =
		// 복합 대입 연산자
		// 좌측 변수의 값과 우측 변수의 값으로 (연산자)=앞에 연산을 실행한 후
		// 좌측 변수에 저장
		// +=, -=, *=, /=, &=
		System.out.println("대입 연산자");
		int test = 5;
		test *= 5;
		System.out.println(test);
		
		

	}

}
