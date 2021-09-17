package ex09_17;

import java.util.Arrays;

public class Sec18 {
	public static void main(String[] args) {
		// 배열의 복사
		// 얇은 복사, 깊은 복사

		// 얇은 복사 27.p
		// 참조하고 있는 객체주소만 복사
		// 값 변경 -> 원본에 영향 O
		String[] folderA = { "myComputer", "myDocuent" };
		String[] folderB = folderA;

		System.out.println("[사본 배열의 값 변경 전] 원본 배열 : " + Arrays.toString(folderA));

		folderB[0] = "newFolder";

		System.out.println("[사본 배열의 값 변경 전] 사본 배열 : " + Arrays.toString(folderB));

		// 깊은 복사 - 28.p
		// 참조하고 있는 객체도 복사
		// 값 변경 -> 원본에 영향 X
		System.out.println("깊은 복사");
		String[] folA = { "myComputer", "myDocument" };
		String[] folB = new String[folA.length];

		System.out.println("[사본 배열의 값 변경 전] 원본 배열 : " + Arrays.toString(folA));

		for (int i = 0; i < folA.length; i++) {
			folB[i] = folA[i];
		}

		folB[0] = "newFolder";
		System.out.println("[사본 배열의 값 변경 후] 원본 배열 : " + Arrays.toString(folA));
		System.out.println("[사본 배열의 값 변경 후] 사본 배열 : " + Arrays.toString(folB));

		// 복사방법
		// 30.p 제공해주는 기능
		// clone -> 깊은 복사
		String[] testA = { "origin", "origin2" };
		String[] testB = { "origin", "origin2" };
		String[] folC = testA.clone(); // -> 깊은 복사
		String[] folD = testB;

		folC[0] = "clone";

		System.out.println("[사본 배열의 값 변경 후] 원본 배열 : " + Arrays.toString(testA));
		System.out.println("[사본 배열의 값 변경 후] 원본 배열 : " + Arrays.toString(testB));
		System.out.println("[사본 배열의 값 변경 후] 사본 배열 : " + Arrays.toString(folC));
		System.out.println("[사본 배열의 값 변경 후] 원본 배열 : " + Arrays.toString(folD));

		// System.arraycopy
		// Arrays.copyOf
		// Arrays.copyRange
	}
}
