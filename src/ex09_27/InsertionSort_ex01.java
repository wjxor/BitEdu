package ex09_27;

import java.util.Arrays;

public class InsertionSort_ex01 {
	public static void main(String[] args) {
		// 삽입 정렬
		// 두번째요소부터 끝까지 하나씩 꺼내서 -> 꺼낸 요소를 기준으로 왼쪽(앞쪽)에 있는 요소들 비교

		int[] arr = { 8, 2, 14, 7, 5 };
		InsertionSort(arr);
	}

	private static void InsertionSort(int[] arr) {
		for (int index = 1; index < arr.length; index++) {
			int temp = arr[index];
			int prev = index - 1;
			while ((prev >= 0) && (arr[prev] > temp)) {
				arr[prev + 1] = arr[prev];
				prev--;
			}
			arr[prev + 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}