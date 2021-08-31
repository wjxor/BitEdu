public class ex01 {

	public static void main(String[] args) {
		try {
			int result = safeAdd(200000000, 2000000);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("오버플로우가 발생 -> 정확한 계산X");
		}
	}

	// 함수 -> 기능단위 -> 사용자 어떠한기능 묶는 행위
	// 접근지정자 (static) 타입 함수이름(매개변수타입 이름...)
	// 접근지정자 - private(공개X), public(공개), protect(특정상황에만 공유)
	// 생략되면 private가 기본값
	// static 끼리논다.
	// 타입 - 반환타입 -> 함수가 끝났을때 결과값의 타입
	// 이름 - 함수사용을 위한 별칭
	// 매개변수 -> 함수안에서 사용할 값들을 전달받기 위해 사용
	// 매개변수 타입 -> 어떠한 변수를 받을건지 종류 구별

	// 장점
	// 재사용성, 가독성

	public static int safeAdd(int left, int right) {
		if ((right > 0)) {
			if (left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}

			else {
				if (left < (Integer.MIN_VALUE - right)) {
					throw new ArithmeticException("오버플로우 발생");
				}
			}
		}

		return left + right;
	}

}
