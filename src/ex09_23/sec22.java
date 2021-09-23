package ex09_23;

import java.util.ArrayList;
import java.util.Scanner;

public class sec22 {
	// 연락처
	static ArrayList<Member> memlist = new ArrayList<Member>();
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Start: while (true) {
			System.out.println("----------");
			System.out.println("1.연락처 저장, 2. 연락처 삭제, 3. 연락처 전체조회, 4. 연락처 검색");
			System.out.println("----------");

			String sss = input.nextLine();
			int inputnum = Integer.parseInt(sss);
			switch (inputnum) {
			case 1:
				add_insert();
				break;
			case 2:
				add_delete();
				break;
			case 3:
				add_selectall();
				break;
			case 4:
				add_select();
				break;
			case 5:
				break Start;
			}
		}
	}

	static void add_selectall() {
		for (Member mem : memlist) {
			System.out.println("이름: " + mem.getName() + ", 전화번호: " + mem.getPhone());
		}
	}

	static void add_select() {
		System.out.println("이름: ");
		String name = input.nextLine();
		for (Member mem : memlist) {
			if (mem.getName().equals(name)) {
				System.out.println("이름 : " + mem.getName() + ", 전화번호 : " + mem.getPhone());
				return;
			}
		}
		System.out.println("해당 이름이 없습니다.");
	}

	static void add_insert() {
		System.out.println("이름: ");
		String name = input.nextLine();
		System.out.println("전화번호: ");
		String phone = input.nextLine();

//			Member mem = new Member(name,phone);
//			memlist.add(mem);
		memlist.add(new Member(name, phone));
	}

	static void add_delete() {
		System.out.println("1. 이름으로 삭제, 2. 전화번호로 삭제");
		int num = Integer.parseInt(input.nextLine());

		if (num == 1) {
			System.out.println("이름: ");
			String name = input.nextLine();

			for (int i = 0; i < memlist.size(); i++) {
				// memlist.get(i) Member 클래스 객체
				// Member클래스 객체.getName() getter
				Member mem = memlist.get(i);
				String mem_name = mem.getName();
				if (mem_name.equals(name)) {
					memlist.remove(i);
					return;
				}
//					if(memlist.get(i).getName().equals(name)) {
//						memlist.remove(i);
//						return;
//					}
			}
			System.out.println("해당하는 이름이 없습니다.");
		} else if (num == 2) {
			System.out.println("전화번호: ");
			String phone = input.nextLine();
			for (Member mem : memlist) {
				if (mem.getPhone().equals(phone)) {
					memlist.remove(mem);
					return;
				}
			}
			System.out.println("해당하는 전화번호가 없습니다.");
		}
	}
}

class Member {
	private String name; // 이름
	private String phone; // 전화번호

	Member(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
