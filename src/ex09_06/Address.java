package ex09_06;

// 주소록(연락처)
public class Address {
	// 필드 - name 이름, phoneNum 전화번호, 단축키번호
	String name;
	String phoneNum;
	int key;

	// 생성자 - 매개변수를 3개 받아서 필드 저장하는
	Address(String name, String phoneNum, int key) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.key = key;
	}

	// 생성자 - 기본생성자(빈)
	Address() {

	}

	// 메서드 - 이름 수정, 전화번호 수정, 단축키번호 수정, 조회
	public void Change_Name(String name) {
		this.name = name;
	}

	public void Change_PhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public void Change_Key(int key) {
		this.key = key;
	}

	public void print() {
		System.out.println("이름 : " + name + "/전화번호 : " + phoneNum + "/단축키 : " + key);
	}

}
