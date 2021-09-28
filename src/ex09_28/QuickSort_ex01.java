package ex09_28;

public class QuickSort_ex01 {
	public static void main(String[] args) {
		// 퀵 정렬

		// 피벗 -> 정렬 기준 -> 각 상황별 피벗에 따라서 효율이 달라진다
		// -> 일반적으로 처음 중간 끝을 사용

		// 피벗 중앙 퀵정렬
		// left right 양끝 (현재 검사중인 위치)
		// (오름차순 기준)
		// left(0)에 있는 값중 피벗보다 큰값이 올떄까지 idx증가
		// right(length - 1)에 있는 값중 피벗보다 작은값 올때까지 idx 감소
		// left right 고정되면 교환 -> 반복
		// (특이케이스 left, right 피벗만나면 스탑)
		// left right 교차하면 정지 -> 피벗 기준 좌측 작은값, 우측 큰값 -> 1회전

		// 피벗 좌측 -> 퀵정렬반복 우측 퀵정렬 반복
		// 좌측 우측 -> 크기가 1 or 0일때까지
		
		// 0 0 0 0 0 0 0 0 0 0 0
		// 			 p
		// 0 0 0 0 0 	  0 0 0 0 0
		// 	   p			  p
		// 0 0   0 0	  0 0   0 0 0
		// p	 p		  p		p
		//   0     0        0     0 0
		//						  p
		//						  퀵정렬
		// 좌우측 크기 0또는 1일때
		
		int[] arr = { 5, 4, 3, 2, 1 };
		QuickSort(arr, 0, arr.length - 1);
	}

	private static void QuickSort(int[] arr, int left, int right) {
		if (left >= right) {
			return;
		}

		int i = left;
		int j = right;

		int pivot_index = (left + right) / 2;
		int pivot = arr[pivot_index];

		while (i < j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}

			if (i >= j) {
				break;
			}

			if (arr[i] == pivot && arr[j] == pivot) {
				i++;
				continue;
			}
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		QuickSort(arr, left, i - 1);
		QuickSort(arr, i + 1, right);

	}
}
