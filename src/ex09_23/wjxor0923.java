package ex09_23;

import java.util.ArrayList;
import java.util.Scanner;

public class wjxor0923 {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("1. 숫자 저장 | 2. 저장된 숫자의 합 | 3. 저장된 숫자 전체 출력 | 4. 삭제(인덱스) |  5. 삭제(값) |  6. 종료");
			
			int ChooseNum = sc.nextInt();
			
			if (ChooseNum == 1) {
				num_Add();
				break;
			} else if (ChooseNum == 2) {
				num_Sum();
				break;
			} else if (ChooseNum == 3) {
				num_ViewAll();
				break;
			} else if (ChooseNum == 4) {
				num_DeleteByIdx();
				break;
			} else if (ChooseNum == 5) {
				num_DeleteByNum();
				break;
			} else {
				System.out.println("");
			}
		}

	}

	static boolean num_Add() {
		System.out.print("리스트에 삽입할 숫자 입력 : ");
		int num = sc.nextInt();
		return list.add(num);
	}

	// 저장된 숫자의 합
	static void num_Sum() {
		int sum = 0;
		for (Integer num : list) {
			sum += num;
		}

		System.out.println("합 : " + sum);
	}

	// 저장된 숫자 전체출력
	static void num_ViewAll() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("[" + (i + 1) + "] " + list.get(i));
		}
	}

	// 삭제할 idx 입력
	static void num_DeleteByIdx() {
		System.out.println("삭제할 위치를 입력하세요");
		int idx = sc.nextInt();
		list.remove(idx - 1);
	}

	// 삭제할 값 입력
	static boolean num_DeleteByNum() {
		System.out.println("삭제할 숫자를 입력하세요");
		int num = sc.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == (num)) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}

}
