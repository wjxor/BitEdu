package Quiz;

import java.util.Scanner;

//char[] (문자 배열)에서 같은 문자의 갯수를 출력
//(공백을 제외한 모든 문자)
public class Quiz_09_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch_arr = str.toCharArray();
		int cnt = 1;

		for (int i = 0; i < ch_arr.length; i++) {
			if (ch_arr[i] != ' ') {
				for (int j = i + 1; j < ch_arr.length; j++) {
					if (ch_arr[i] == ch_arr[j]) {
						cnt++;
						ch_arr[j] = ' ';
					}
				}
				System.out.println(ch_arr[i] + "=" + cnt);
				cnt = 1;
			}

		}

	}
}
