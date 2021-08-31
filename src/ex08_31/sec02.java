package ex08_31;
public class sec02 {

	public static void main(String[] args) {
		System.out.println("증감 연산자");

		// 1
		int x = 3;
		int y = 2;
		int result = ++x + y--;
		// result = 4 + 2 = 6
		System.out.println(result);

		// 2
		x = 3;
		y = 2;
		int result2 = --x + x++ + y-- + --y;
		// result2 = 2 + 2 + 2 + 0 = 6
		System.out.println(result2);

		// 3
		x = 5;
		y = 6;
		int result3 = ++x + y-- - x++ + --y;
		// result3 = 6 + 6 - 6 + 4 = 10
		System.out.println(result3);

		// 논리 부정 연산자 !
		System.out.println("논리 부정 연산자");
		boolean boolean_val = false;
		boolean temp_boolean = !boolean_val;
		System.out.println(boolean_val); // false
		System.out.println(!boolean_val); // true
		System.out.println(temp_boolean); // true
		System.out.println(!temp_boolean); // false
		System.out.println(!!temp_boolean); // true

		// 비트 반전 연산자 ~
		// 정수 타입 피연산자에 사용
		System.out.println("비트 반전 연산자");
		byte test = 126;
		String binaryString3 = Integer.toBinaryString(test);
		System.out.println(binaryString3); // 01111110
		int int_temp = ~test;
		// 126 -> 이진수로 바꾸면
		// 01111110
		// 10000001
		// 최상위부호가 1이면
		// 10000001 -1
		// 10000000 반전
		// 01111111 -> 127 최상위부호가 1이었으니깐 -127
		System.out.println(int_temp);
		String binaryString4 = Integer.toBinaryString(test);
		System.out.println(binaryString4);
		// 111111111111111111111111 10000001

		byte test2 = 32;
		// 00100000
		int int_temp2 = ~test2;
		// 11011111
		// (첫번째)최상위부호가 1이니 -1 하고 반전시킨 결과에 -부호추가
		// 11011110
		// 00100001 -> -33
		System.out.println(int_temp2);
	}

}
