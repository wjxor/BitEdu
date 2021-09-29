package ex09_29;

import java.util.Arrays;

public class sec25 {
	public static void main(String[] args) {
		// 이차원배열
		// 배열을 여러개 가지는 배열 생각
		// 일차원배열 -> {1, 2, 3, 4}
		// -> {5, 6, 7}
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 5, 6, 7 };
		int[][] arr3 = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 1 } };

		System.out.println("이차원배열");
		System.out.println("arr3[2][1] : " + arr3[0][2]);
		// 일차원 배열의 length와 이차원 배열의 length의 차이는 요소차이. 이차원배열은 배열 한 뭉탱이를 요소로 판별
		System.out.println(arr1.length);
		System.err.println(arr3.length);
		// 이차원배열 출력
		// arr3.length 행의 갯수 -> 일차원배열의 갯수
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j]);
			}
		}
		System.out.println();

		// 배열의 복사
		// 얇은 복사, 깊은 복사

		// 얇은 복사 - page 27
		// 참조하고 있는 객체주소만 복사
		// 값 변경 -> 원본에 영향 0
		System.out.println("얇은 복사");
		String[] folderA = { "myComputer", "myDocument" };

		// folderA.length // --> ???

		String[] folderB = folderA;

		// Arrays 는 자바에서 제공하는 구조 외워야함
		System.out.println("[사본 배열의 값 변경 전] 원본 배열: " + Arrays.toString(folderA));

		folderB[0] = "newFolder"; // 사본배열의 첫 번째 인덱스 값 변경

		System.out.println("[사본 배열의 값 변경 후] 원본 배열:" + Arrays.toString(folderA));
		System.out.println("[사본 배열의 값 변경 후] 사본 배열:" + Arrays.toString(folderB));

		// 깊은 복사 - page 28
		// 참조하고 있는 객체도 복사
		// 값 변경 -> 원본에 영항 X
		System.out.println("깊은 복사");
		String[] folA = { "myComputer", "myDocument" };
		String[] folB = new String[folA.length]; // {"",""}

		System.out.println("[사본 배열의 값 변경 전] 원본 배열: " + Arrays.toString(folA));

		// 원본 {"myComputer", "myDocument"}
		// 사본 {"",""}
		// 반복 {"myComputer",""}
		// {"myComputer", "myDocument"}
		for (int i = 0; i < folA.length; i++) {
			folB[i] = folA[i]; // folA -> 주소값 folA[idx] -> 값
		}

		folB[0] = "newFolder"; // 사본 배열의 첫 번째 인덱스 값 변경

		System.out.println("[사본 배열의 값 변경 후] 원본 배열: " + Arrays.toString(folA));
		System.out.println("[사본 배열의 값 변경 후] 사본 배열: " + Arrays.toString(folB));

		// 일반적으로 프로그래밍 -> 복사는 깊은복사를 지향한다.
		// 사본을 만든다는 의미는 원본을 훼손X 위함.

		// 복사방법
		// Object -> 최상위 클래스 -> 모든 클래스 가져야할 필드, 메서드
		// clone -> 복사하는 기능 -> 깊은복사
		String[] testA = { "origin", "origin2" }; // B에있는 new String[] 생략한거임.
		String[] testB = new String[] { "origin", "origin2" };
		String[] folC = testA.clone(); // ->깊은복사
		String[] folD = testB; // ->얇은복사

		folC[0] = "clone";
		folD[0] = "clone";

		System.out.println("[사본 배열의 값 변경 후] 원본testA 배열: " + Arrays.toString(testA));
		System.out.println("[사본 배열의 값 변경 후] 원본testB 배열: " + Arrays.toString(testB));
		System.out.println("[사본 배열의 값 변경 후] 사본folC 배열: " + Arrays.toString(folC));
		System.out.println("[사본 배열의 값 변경 후] 사본folD 배열: " + Arrays.toString(folD));

		// page 30 -> 제공해주는 기능 -> 익혀야 할것은 사용법 -> 검색할수 있는 수준까지 가야한다.
		// System.arraycopy
		// Arrays.copyOf
		// Arrays.copyRange

		array();
	}

	static void array() {
		// 배열 - 같은타입의 값 or 객체(주소)를 모아놓은 구조(타입)
		// 배열의 기본 선언
		int[] int_arr = new int[3];
		// 공간 0 0 0 -> 0 - int 타입을 저장할 수 있는 메모리공간
		// 주소 0 1 2 - 배열의 인덱스(주소, 자리, 몇번째 공간) , 0부터 시작

		// 값 1 2 3
		// 배열객체[인덱스(idx)] -> 해당하는 인덱스 공간 접근(사용 or 저장)
		int_arr[0] = 1; // -> 0번째 자리에 정수 1저장 // 1 0 0
		int_arr[1] = 2; // -> 1번째 자리에 정수 2저장 // 1 2 0
		int_arr[2] = 3; // -> 2번째 자리에 정수 3저장 // 1 2 3

		int num = int_arr[0];
		System.out.println(num);

		// 배열객체(변수).length --> 배열의 최대크기 아래예제에서는 3
		for (int i = 0; i < int_arr.length; i++) {
			int_arr[i] = i + 1;
		}

		for (int i = 0; i < int_arr.length; i++) {
			int result = int_arr[i];
			System.out.println(result);
		}

		// 이차원배열

		// 일차원배열 -> 일렬로
		// 0 0 0 0 -> 열

		// 이차원배열 -> 일차원 배열을 여러개 저장할 수 공간
		// 0 0 0 -> int_arr
		// 0 0 0 -> 열이 모여서 행을 이룬다
		// 1번
		int[][] int_arr2 = new int[3][]; // 앞에 [] 크기가 정해져야 된다. -> 아래랑 같다
		// 2번
		int[] int_arr3 = new int[3]; // 배열의 크기가 정해져야된다.

		// 2번 -> 정수를 여러개 모아서 저장 -> 정수 3개 저장
		// 1번 -> 정수배열을 여러개 모아서 저장 -> 배열 3개 저장

		// 이차원배열[행][열]
		// a~c 일차원배열
		// a -> 1 2 3 4
		// b -> 5 6 7 8
		// c -> 9 10

		// int[][] test = new int[3][];
		// 0 -> a(1 2 3 4)
		// 0 -> b(5 6 7 8)
		// 0 -> c(9 10)

		// 0번 1번 2번 -> idx
		// 0번 -> 배열 1 2 3 4
		// 0 1 2 3
		// [0][2] -> 3값
	}
}
