package ex09_03;

// Acc클래스 계좌관련된 클래스
// acc_number(계좌번호), acc_money(잔액), acc_username(예금주), acc_pw(비밀번호)
// String, int, String, String
// 모든 필드는 public
public class Acc {
	public String acc_number;
	public int acc_money;
	public String acc_username;
	public String acc_pw;

	// 기본생성자 - 생성자가 없으면 자동으로 생성, 다른 매개변수를 가지는 생성자가 있으면 생성이 안된다.
	Acc() {

	}

	// 생성자(계좌번호, 잔액, 예금주, 비밀번호)
	// 각각의 변수를 초기화
	Acc(String acc_number, int acc_money, String acc_username, String acc_pw) {
		this.acc_number = acc_number;
		this.acc_money = acc_money;
		this.acc_username = acc_username;
		this.acc_pw = acc_pw;
	}

	public void AddMoney(int money, String pw) {
		if (acc_pw.equals(pw)) {
			acc_money += money;
			System.out.println("입금 : " + money + " 총 잔액 : " + acc_money);
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	}

	public void MinusMoney(int money, String pw) {
		if (acc_pw.equals(pw)) {
			if (acc_money < money) {
				return;
			}

			if (acc_money >= money) {
				acc_money -= money;
				System.out.println("출금 : " + money + " 총 잔액 : " + acc_money);
			} else {
				System.out.println("잔액부족");
			}
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	}

	// print
	// 예금주 : 고상협, 계좌번호 : 1111-2222, 잔액 : 10000
	public void print() {
		acc_username = "wjxor";
		acc_number = "1111-2222";
		acc_money = 10000;
	}
}
