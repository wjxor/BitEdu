package ex09_09;

import java.util.Scanner;

import javax.print.DocFlavor.CHAR_ARRAY;

import Quiz.GameCharacter;
import Quiz.Warrior2;
import Quiz.Archer;

public class Game_main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		GameCharacter[] character_arr = new GameCharacter[8];
		boolean isrun = true;

		while (isrun) {
			System.out.println("1. 캐릭터생성, 2. 캐릭터선택, 3. 캐릭터 조회, 4. 캐릭삭제");
			int num = Integer.parseInt(sc.nextLine());
			switch (num) {
			case 1:
				Create_char(character_arr);
				break;
			case 2:
				Select_char(character_arr);
				break;
			case 3:
				Show_char(character_arr);
				break;
			case 4:
				Delete_char(character_arr);
				break;
			case 5:
				isrun = false;
				break;

			default:
				break;
			}
		}

	}

	static void Create_char(GameCharacter[] char_arr) {
		System.out.println("1. 전사, 2. 궁수");
		int num = Integer.parseInt(sc.nextLine());

		boolean isspace = false; // 자리없음(캐릭터 생성공간)
		for (int i = 0; i < char_arr.length; i++) {
			if (char_arr[i] == null) {
				if (num == 1) {
					System.out.println("전사생성");
					char_arr[i] = new Warrior2("검", 100, 100);
				} else if (num == 2) {
					System.out.println("궁수생성");
					char_arr[i] = new Archer("활", 100, 100);
				}
				return;
			}
		}
	}

	static void Select_char(GameCharacter[] char_arr) {
		Show_char(char_arr);
		System.out.println("캐릭터를 선택해주세요.");
		int num = Integer.parseInt(sc.nextLine());
		boolean result = char_arr[num - 1] instanceof Archer;
		if (result) {
			Archer archer = (Archer) char_arr[num - 1];
			archer.attack();
			archer.evasion();
			archer.reload(10);
		}
		boolean result2 = char_arr[num - 1] instanceof Warrior2;
		if (result2) {
			Warrior2 warrior = (Warrior2) char_arr[num - 1];
			warrior.attack();
			warrior.guard();
			warrior.taunt();
		}
	}

	static void Show_char(GameCharacter[] char_arr) {
		for (int i = 0; i < char_arr.length; i++) {
			if (char_arr[i] != null) {
				if (char_arr[i] instanceof Warrior2) {
					System.out.print((i + 1) + "전사 ");
				} else if (char_arr[i] instanceof Archer) {
					System.out.print((i + 1) + "궁수 ");
				}
			} else {
				System.out.print((i + 1) + "비어있음");
			}
		}
		System.out.println();
	}

	static void Delete_char(GameCharacter[] char_arr) {
		Show_char(char_arr);
		System.out.println("삭제할 자리번호를 입력해주세요.");
		int num = Integer.parseInt(sc.nextLine());
		char_arr[num - 1] = null;
		Show_char(char_arr);
	}

}
