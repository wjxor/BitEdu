package ex09_27;

import java.util.Arrays;

public class BubbleSort_ex01 {
	public static void main(String[] args) {
		// 버블정렬
		// -> 맨 마지막부터 고정(최소값, 최대값)
		// -> 두자리씩 비교
		// -> n-1번 반복
		int[] arr = { 8, 2, 14, 7, 5 };
		BubbleSort(arr);
	}

	private static void BubbleSort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}
