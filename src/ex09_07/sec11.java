package ex09_07;

import java.util.Arrays;

public class sec11 {

	public static void main(String[] args) {
		// 배열
		// 다양한 선언 및 사용 방법
		int[] score = new int[3]; // int타입의 저장공간이 3개
		// 접근할떄는 0, 1, 2
		// 각 idx 공간에 값 저장
		score[0] = 3;
		score[1] = 2;
		score[2] = 1;

		// 선언할떄만 사용가능 (선언과 동시에 값을 저장할때만)
		int[] score2 = { 3, 2, 1 };

		int[] score3;
		// {값, 값, 값} -> 선언과 동시에만 사용가능
		// score3 = {3, 2, 1};
		score3 = new int[] { 3, 2, 1 };
		int[] score4 = null;
		score4 = new int[3];
		score4[0] = 3;
		score4[1] = 2;
		score4[2] = 1;

		// 배열의 길이 - 주로 반복문에 사용
		System.out.println(score.length);
		int sum = 0;
		for (int i = 1; i < score4.length; i++) {
			sum += score4[i];
		}
		System.out.println(sum);

		// foreach
		int sum2 = 0;
		for (int sc : score4) {
			sum2 += sc;
		}
		System.out.println(sum2);

		int[] jumsu_arr = new int[4];
		for (int i = 0; i < jumsu_arr.length; i++) {
			jumsu_arr[i] = i + 1;
		}

		int[] jumsu_arr2 = new int[6];
		// 배열 복사 -> 3가지 방법
		// 복사 대상, 시작위치, 새로 복사해서 저장할 대상, 복사본 시작위치, 복사할 길이
		System.arraycopy(jumsu_arr, 0, jumsu_arr2, 0, jumsu_arr.length);

		// 두번째
		int[] jumsu_arr3 = Arrays.copyOf(jumsu_arr, 6);

		// for 이용 직접 옮기는 방법
		// 생략

		// indexoutof -> 배열의 크기 확인하고 인덱스 확인
		jumsu_arr3[6] = 5;
	}

}
