package ex09_27;

import java.util.Arrays;

public class wjxor0927 {
	public static void main(String[] args) {
		int[] arr = { 8, 2, 14, 7, 5 };
		// Q1(arr);
		// Q2(arr);
		// Q3(arr);
	}

	// 버블정렬 내림차순
	private static void Q1(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] < arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}

	// 선택정렬 내림차순
	private static void Q2(int[] arr) {
		int indexMin, temp;
		// 회전수 0 ~ n-2, 1 ~ n-1
		for (int i = 0; i < arr.length - 1; i++) {
			indexMin = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[indexMin]) {
					indexMin = j;
				}
			}

			temp = arr[indexMin];
			arr[indexMin] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	// 삽입정렬 내림차순
	private static void Q3(int[] arr) {
		for (int index = 1; index < arr.length; index++) {
			int temp = arr[index];
			int prev = index - 1;
			while ((prev >= 0) && (arr[prev] < temp)) {
				arr[prev + 1] = arr[prev];
				prev--;
			}
			arr[prev + 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
