package ex09_17;

import java.util.Scanner;

public class wjxor0917 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Q1();
		// Q2();
		// Q3();
		Q4();
	}

	// 5개의 양수를 입력받은 배열의 모든 요소의 합 출력
	public static void Q1() {
		int[] arr = new int[5];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int j = 0; j < arr.length; j++) {
			sum += arr[j];
		}

		System.out.println("합 : " + sum);

	}

	// 배열의 최댓값과 최솟값을 구하는 메서드
	public static void Q2() {
		int[] arr = { 10, 11, 2, 5, 3, 3, 24, 15, 6, 9 };

		int minNum = arr[0];
		int maxNum = arr[0];

		for (int i = 0; i < arr.length; i++) {
			minNum = Math.min(arr[i], minNum);
			maxNum = Math.max(arr[i], maxNum);
		}

		System.out.println("최댓값 : " + maxNum);
		System.out.println("최솟값 : " + minNum);

	}

	// 순서가 없는 두 배열에서 서로 같은 요소를 포함하는지 판별
	// ex) A배열[1, 3, 2], B배열[2, 3, 1]은 같은 배열입니다.
	public static void Q3() {
		int[] arr1 = { 1, 3, 2 };
		int[] arr2 = { 2, 3, 1 };
		int cnt = 0;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					cnt++;
				}
			}
		}

		if (cnt == arr1.length) {
			System.out.println("같은 배열입니다.");
		} else {
			System.out.println("다른 배열입니다.");
		}
	}

	// 중복된 요소를 제거한 새 배열을 반환
	// 중복 제거된 빈 요소는 기본값 0을 삽입
	public static void Q4() {
		int[] arr = { 5, 10, 9, 27, 2, 8, 10, 4, 27, 1 };
		int[] result = new int[10];

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[i] = 0;

				}
			}
			if (arr[i] != 0) {
				result[i] = arr[i];
			}
		}

		for (int k = 0; k < result.length; k++) {
			System.out.printf("%d ", result[k]);
		}
	}

}
