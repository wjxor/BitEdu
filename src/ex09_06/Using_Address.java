package ex09_06;

import java.util.Scanner;

public class Using_Address {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Address addr = null;
		Start: while (true) {
			System.out.println("1. 연락처 등록, 2. 이름 수정, " + "3. 전화번호 수정, 4. 단축키 수정, 5. 조회, 6. 종료");
			int num = Integer.parseInt(sc.nextLine());
			switch (num) {
			case 1:
				addr = new Address("wjxor", "010-1234-5678", 0);
				break;
			case 2:
				if (addr != null) {
					String name = sc.nextLine();
					addr.Change_Name(name);
				}
				break;
			case 3:
				if (addr != null) {
					String phone_Num = sc.nextLine();
					addr.Change_PhoneNum(phone_Num);
				}
				break;
			case 4:
				if (addr != null) {
					int key = Integer.parseInt(sc.nextLine());
					addr.Change_Key(key);
				}
				break;
			case 5:
				if (addr != null) {
					addr.print();
				}
				break;
			case 6:
				break Start;
			}
		}
	}

}
