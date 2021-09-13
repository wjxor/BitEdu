package ex09_13;

public class sec15 {

	public static void main(String[] args) {
		// 2차원 배열 별찍기
		// *
		// **
		// ***
		// ****
		int num = 4;
		char[][] char_arr = new char[num][num];

		// 행
		for (int i = 0; i < char_arr.length; i++) {
			// 각 행에 대한 열의 길이만큼 반복
			for (int j = 0; j < char_arr[i].length; j++) {
				char_arr[i][j] = '*';
			}
		}

		for (char[] carr : char_arr) {
			for (char c_val : carr) {
				System.out.print(c_val);
			}
			System.out.println();
		}

	}

}
