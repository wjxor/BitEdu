package ex09_01;

public class IfExample {

	public static void main(String[] args) {
		// IfExample();
		// IfElseExample();
		// IfElseIfElseExample();
		// IfDiceExample();
		// IfNestedExample();
		// SwitchExample();
		// SwitchNoBreakCaseExample();
		// SwitchCharExample();
		SwitchStringExample();
	}

	private static void SwitchStringExample() {
		String position = "과장";

		switch (position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
		}
	}

	private static void SwitchCharExample() {
		char grade = 'B';

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}
	}

	private static void SwitchNoBreakCaseExample() {
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[현재시간 : " + time + " 시]");

		switch (time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
	}

	private static void SwitchExample() {
		int num = (int) (Math.random() * 6) + 1;

		switch (num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
			break;
		}
	}

	private static void IfNestedExample() {
		int score = (int) (Math.random() * 20) + 81;
		System.out.println("점수 : " + score);

		String grade;

		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}

		System.out.println("학점 : " + grade);
	}

	private static void IfDiceExample() {
		int num = (int) (Math.random() * 6) + 1;

		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
	}

	private static void IfElseIfElseExample() {
		int score = 75;

		if (score >= 90) {
			System.out.println("점수가 100 ~ 90 입니다.");
			System.out.println("등급은 A 입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 80 ~ 89 입니다.");
			System.out.println("등급은 B 입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 70 ~ 79 입니다.");
			System.out.println("등급은 C 입니다.");
		} else {
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}
	}

	private static void IfElseExample() {
		int score = 85;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
	}

	private static void IfExample() {
		int score = 93;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}

		if (score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
	}

}
