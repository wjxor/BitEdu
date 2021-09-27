package ex09_27;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		// 선택정렬
		// 맨 앞에서부터 고정(최소값, 최대값)
		// 고정안된 값들 중 최소값, 최대값
		int[] arr = { 8, 2, 14, 7, 5 };
		SelectionSort(arr);
	}

	private static void SelectionSort(int[] arr) {
		int indexMin, temp;
		// 회전수 0 ~ n-2, 1 ~ n-1
		for (int i = 0; i < arr.length - 1; i++) {
			indexMin = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[indexMin]) {
					indexMin = j;
				}
			}

			temp = arr[indexMin];
			arr[indexMin] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
