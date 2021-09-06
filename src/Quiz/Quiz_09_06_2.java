package Quiz;

import java.util.Scanner;

public class Quiz_09_06_2 {

	public static void main(String[] args) {
		Game game = null;

		while (true) {
			System.out.println("1. 게임클래스 생성, 2. 조회, 3. 난이도 조절, 4. 점수조절, 5. 종료");
			Scanner sc = new Scanner(System.in);

			int num = Integer.parseInt(sc.nextLine());

			if (num == 1) {
				String game_name = sc.nextLine();
				int game_lev = Integer.parseInt(sc.nextLine());
				int game_score = Integer.parseInt(sc.nextLine());
				game = new Game(game_name, game_lev, game_score);
			} else if (num == 2) {
				game.print();
			} else if (num == 3) {
				System.out.println("1. 난이도업, 2. 난이도다운");
				int num2 = Integer.parseInt(sc.nextLine());

				if (num2 == 1) {
					game.Lev_Up();
				} else if (num == 2) {
					game.Lev_Down();
				}
			} else if (num == 4) {
				System.out.println("1. 점수증가, 2. 점수감소");
				int num2 = Integer.parseInt(sc.nextLine());

				if (num2 == 1) {
					game.Score_Up();
				} else if (num2 == 2) {
					game.Score_Down();
				}
			} else if (num == 5) {
				System.out.println("종료");
				break;
			}
		}
	}

}

// Game 클래스 생성
// 필드 - type 게임종류, lev 레벨, score 점수
// 생성자 -> 게임종류, 레벨, score
// 메서드 -> Lev_Up() 난이도 업, Lev,Down() 난이도 다운, Score_Up 점수획득, Score_Down 점수감소
// print -> 게임데이터 출력
// Lev_Up -> lev++ lev 출력
// Lev_Down -> lev-- lev 출력 0이하는 이미 최하렙입니다.
// Score_Up -> 2점 증가, score 출력
// Score_Down -> 2점 감소, score 출력
// print -> lev 1 -> score 90이상 승리
// 		 -> lev 2 -> score 80이상 승리
// 		 -> lev 3 -> score 70이상 승리
class Game {
	String type;
	int lev;
	int score;

	Game(String type, int lev, int score) {
		this.type = type;
		this.lev = lev;
		this.score = score;
	}

	public void Lev_Up() {
		lev++;
		System.out.println("레벨은 " + lev + " 입니다.");
	}

	public void Lev_Down() {
		if (lev <= 0) {
			lev = 1;
		} else {
			lev--;
		}

		System.out.println("레벨은 " + lev + " 입니다.");
	}

	public void Score_Up() {
		score += 2;
		System.out.println("점수는 " + score + " 입니다.");
	}

	public void Score_Down() {
		if (score < 0) {
			score = 0;
		} else {
			score -= 2;
		}

		System.out.println("점수는 " + score + " 입니다.");
	}

	public void print() {
		if (lev == 1) {
			if (score >= 90) {
				System.out.println("90이상 승리");
			}
		} else if (lev == 2) {
			if (score >= 80) {
				System.out.println("80이상 승리");
			}
		} else {
			if (score >= 70) {
				System.out.println("70이상 승리");
			}
		}
	}
}
