package ex09_23;

import java.util.ArrayList;
import java.util.Scanner;

public class wjxor0923 {
	static ArrayList<Integer> arrlist = new ArrayList<Integer>();

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("1. 숫자저장, 2.저장된 숫자합 출력, 3.저장된 숫자 전체 출력, 4.삭제 idx, 5.삭제 숫자(값), 6.종료");
			System.out.println("---------------------------------------------------------------------------");

			int num = Integer.parseInt(input.nextLine());
			switch (num) {
			case 1:
				number_add();
				break;
			case 2:
				numberlist_sum();
				break;
			case 3:
				numberlist_selectall();
				break;
			case 4:
				numberlist_delete_fromidx();
				break;
			case 5:
				numberlist_delete_fromvalue();
				break;
			}
		}
	}

	// 숫자저장
	static void number_add() {
		System.out.println("숫자 : ");
		int inputnum = Integer.parseInt(input.nextLine());
		// ArrayList .add(요소) 요소 추가
		arrlist.add(inputnum);
	}

	// 숫자리스트 전체 합
	static void numberlist_sum() {
		int sum = 0;
		for (int i = 0; i < arrlist.size(); i++) {
			sum += arrlist.get(i);
		}
		System.out.println(sum);

//	      for(int num : arrlist) {
//	         
//	      }
	}

	// 숫자리스트 전체 조회
	static void numberlist_selectall() {
		for (int num : arrlist) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	// 숫자리스트 인덱스로 삭제
	static void numberlist_delete_fromidx() {
		System.out.println("idx : ");
		int inputidx = Integer.parseInt(input.nextLine());
		arrlist.remove(inputidx);
	}

	// 숫자리스트 값으로 삭제
	static void numberlist_delete_fromvalue() {
		System.out.println("값 : ");
		int inputnum = Integer.parseInt(input.nextLine());
		for (int i = 0; i < arrlist.size(); i++) {
			if (arrlist.get(i) == inputnum) {
				arrlist.remove(i);
				return;
			}
		}
		System.out.println("해당 값이 존재하지 않습니다.");
	}

}
