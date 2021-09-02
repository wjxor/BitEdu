package Quiz;

import java.util.Scanner;

public class Quiz_09_02 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Q1();
		// Q2();
		// Q3();
		// Q4();
		// Q5();
		// Q6();
		// Q7();
		// Q8();
		// Q9();
		// Q10();
		// Q11();
		// Q12();
		// Q13();
		// Q14();
		 Q15();

	}

	// 정수를 입력받아 첫 줄에 입력받은 숫자를 출력하고
	// 둘째 줄에 음수이면 minus라고 출력하는 프로그램을 작성하시오.
	private static void Q1() {
		int num = Integer.parseInt(sc.nextLine());

		System.out.println(num);

		if (num < 0) {
			System.out.println("minus");
		}
	}

	// "몸무게 + 100 - 키"를 비만수치 공식이라고 하자.
	// 키와 몸무게를 자연수로 입력받아 첫 번째 줄에 비만수치를 출력하고,
	// 비만수치가 0보다 크면 다음줄에 비만이라는 메시지를 출력
	private static void Q2() {
		int weight = Integer.parseInt(sc.nextLine());
		int height = Integer.parseInt(sc.nextLine());

		int obesity = weight + 100 - height;

		System.out.println(obesity);

		if (obesity > 0) {
			System.out.println("비만");
		}

	}

	// 나이를 입력받아 20살 이상이면 "adult"라고 출력
	// 그렇지 않으면 몇 년후에 성인이 되는지를 "? years later"라는 메시지를 출력
	private static void Q3() {
		int age = Integer.parseInt(sc.nextLine());

		if (age >= 20) {
			System.out.println("adult");
		} else {
			System.out.printf("%d years later", 20 - age);
		}
	}

	// 복싱체급은 몸무게가
	// 50.80kg 이하를 Flyweight,
	// 61.23kg 이하를 Lightweight,
	// 72.57kg 이하를 Middleweight,
	// 88.45kg 이하를 Cruiserweight,
	// 88.45kg 초과를 Heavyweight라고 하자
	// 몸무게를 입력받아 체급을 출력
	private static void Q4() {
		Float weight = Float.parseFloat(sc.nextLine());

		if (weight <= 50.80) {
			System.out.println("Flyweight");
		} else if (weight <= 61.23) {
			System.out.println("Lightweight");
		} else if (weight <= 72.57) {
			System.out.println("Middleweight");
		} else if (weight <= 88.45) {
			System.out.println("Cruiserweight");
		} else {
			System.out.println("Heavyweight");
		}

	}

	// 1부터 15까지 차례로 출력(while)
	private static void Q5() {
		int num = 1;

		while (num <= 15) {
			System.out.println(num);
			num++;
		}
	}

	// 100이하의 정수만 실행되는 프로그램.
	// while을 이용하여 1부터 입력받은 정수까지의 합 출력
	private static void Q6() {
		int num = Integer.parseInt(sc.nextLine());
		int i = 1, sum = 0;

		if (num > 100) {
			System.out.println("100 넘으면 안됩니다.");
		} else {
			while (i <= num) {
				sum += i;
			}
			System.out.println(sum);
		}

	}

	// 두 개의 실수를 입력받아 모두 4.0이상이면 "A", 모두 3.0이상이면 "B",
	// 아니면 "C"라고 출력
	private static void Q7() {
		Float fNum1 = Float.parseFloat(sc.nextLine());
		Float fNum2 = Float.parseFloat(sc.nextLine());

		if ((fNum1 >= 4.0f) && (fNum2 >= 4.0f)) {
			System.out.println("A");

		} else if ((fNum1 >= 3.0f) && (fNum2 >= 3.0f)) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}

	}

	// 한 개의 정수를 입력받아 양수인지 음수인지 출력하는 작업을 반복하다가
	// 0이 입력되면 종료
	private static void Q8() {
		while (true) {
			int num = Integer.parseInt(sc.nextLine());

			if (num < 0) {
				System.out.println("음수");
			} else if (num == 0) {
				System.out.println("0이 입력되어 프로그램이 종료됩니다.");
				break;
			} else {
				System.out.println("양수");
			}
		}

	}

	// 남자는 'M' 여자는 'F'로 나타내기로 하고 18세 이상을 성인
	// 성별(MorF)과 나이를 입력받아 성인남자, 미성년남자, 미성년여자, 성인여자를 구분
	private static void Q9() {
		String gender = sc.nextLine();
		int age = Integer.parseInt(sc.nextLine());

		if (age >= 18) {
			if (gender.equals("M")) {
				gender = "성인남자";
			} else {
				gender = "성인여자";
			}
		} else {
			if (gender.equals("F")) {
				gender = "미성년여자";
			} else {
				gender = "미성년남자";
			}
		}

		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
	}

	// 3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수들 중 최소값을 출력
	private static void Q10() {
		int num1 = Integer.parseInt(sc.nextLine());
		int num2 = Integer.parseInt(sc.nextLine());
		int num3 = Integer.parseInt(sc.nextLine());

		int MinNum;
		MinNum = (num1 < num2 && num1 < num3) ? num1 : (num2 < num3) ? num2 : num3;

		System.out.println(MinNum);

	}

	// 정수를 계속 입력받다가 100이상의 수가 입력이 되면
	// 마지막 입력된 수를 포함하여 합계와 평균을 출력
	private static void Q11() {
		int cnt = 0, sum = 0;
		float avg = 0;

		while (true) {
			int num = Integer.parseInt(sc.nextLine());

			cnt++;
			sum += num;

			if (num >= 100) {
				break;
			}
		}

		avg = (float) sum / (float) cnt;
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f", avg);
	}

	// 정수를 입력받아서 3의 배수가 아닌 경우에는 아무 작업도 하지 않고,
	// 3의 배수인 경우에는 3으로 나눈몫을 출력하는 작업을 반복하다가
	// -1이 입력되면 종료
	private static void Q12() {

		while (true) {
			int num = Integer.parseInt(sc.nextLine());
			int result = num / 3;

			if (num == -1) {
				System.out.println("종료되었습니다.");
				break;
			}

			if (num % 3 == 0) {
				System.out.println(result);
			}
		}

	}

	// 숫자를 입력받아서 다음과 같이 출력되도록 프로그램을 작성
	// 1. 대한민국
	// 2. 미국
	// 3. 일본
	// 4. 중국
	// 이외는 none 출력
	private static void Q13() {
		int num = Integer.parseInt(sc.nextLine());

		if (num == 1) {
			System.out.println("대한민국");
		} else if (num == 2) {
			System.out.println("미국");
		} else if (num == 3) {
			System.out.println("일본");
		} else if (num == 4) {
			System.out.println("중국");
		} else {
			System.out.println("none");
		}
	}

	// 문자를 입력받아서 입력받은 문자를 20번 출력
	private static void Q14() {
		String str = sc.nextLine();

		for (int i = 1; i <= 20; i++) {
			System.out.println(str);
		}
	}

	// 하나의 정수를 입력받아 1부터 입력받은 정수까지의 짝수를 차례대로 출력
	private static void Q15() {
		int num = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
	}
}
