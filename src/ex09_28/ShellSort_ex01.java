package ex09_28;

import java.util.Arrays;

public class ShellSort_ex01 {
	public static void main(String[] args) {
		// 셀 정렬
		// 삽입 정렬 단점보완
		// 회전수=idx 기준으로 좌측비교(정렬)
		// 5 4 3 2 1
		// 삽입정렬(오름차순)
		// 1회전 -> 4
		// 5 < 4 => 4 5 3 2 1
		// 2회전 3
		// 5 < 3 => 4 	5 2 1
		// 4 < 3 => 3 4 5 2 1
		// 3회전 2
		// 5 < 2 => 3 4   5 1
		// 4 < 2 => 3	4 5 1
		// 3 < 2 => 2 3 4 5 1
		// 4회전 1
		// 5 < 1 => 2 3 4   5
		// 4 < 1 => 2 3   4 5
		// 3 < 1 => 2   3 4 5
		// 2 < 1 => 1 2 3 4 5

		// 셀 정렬
		// 특정 간격으로 묶서섭 분ㄴ배열(간격이랑 부분배율 갯수는 같음)
		// 부분배열들을 각각 삽입 정렬(1회전)
		// -> 상황마다 간격, 좋아지는 간격마다 효율이 달라진다.

		// 간격 줄이고, 줄어진 간격으로 다시 묶어서 삽입정렬
		// 간격 1이 될떄까지 반복
		// 간격 <=> 부분배열 개수

		int[] arr = { 5, 4, 3, 2, 1 };
		ShellSort(arr);
	}

	private static void ShellSort(int[] arr) {
		System.out.println(Arrays.toString(arr));
		// 간격 : 배열의 크기 / 2 줄어드는 간격 = 간격 / 2
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			// 부분배열을 표시하기 위한 반복
			// 부분배열의 갯수는 간격과 일치하기 떄문에 -> gap
			// 부분배열 시작 index 0 ~ gap - 1
			for (int startindex = 0; startindex < gap; startindex++) {
				// 삽입정렬
			}
		}
	}

	static void insertionSortByGap(int[] arr, int gap, int startIndex) {
		for (int i = startIndex + gap; i < arr.length; i = i + gap) {
			int j;
			int target = arr[i];

			for (j = i - gap; j >= 0 && arr[j] > target; j = j - gap) {
				arr[j + gap] = arr[j];
			}
			arr[j + gap] = target;
		}
	}
}