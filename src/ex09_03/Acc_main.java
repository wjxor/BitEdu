package ex09_03;

public class Acc_main {

	public static void main(String[] args) {
		Acc acc1 = new Acc();
		acc1.acc_number = "1111-2222";
		acc1.acc_money = 10000;
		acc1.acc_username = "wjxor";
		acc1.acc_pw = "1234";

		System.out.println(acc1.acc_number);
		System.out.println(acc1.acc_money);
		System.out.println(acc1.acc_username);
		System.out.println(acc1.acc_pw);

		Acc acc2 = new Acc("1111-1222", 23030, "wj", "1212");
		acc2.print();

		Acc acc3 = new Acc("1122-1222", 33330, "xor", "1212");
		acc3.print();
		acc3.AddMoney(10000, "1212");
		acc3.MinusMoney(200, "1212");

	}

}
