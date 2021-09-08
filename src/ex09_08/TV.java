package ex09_08;

public class TV extends Product {
	int ch;

	TV() {

	}

	TV(int price, int ch) {
		super(price);
		System.out.println("자식 생성자");
		this.ch = ch;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("가격 : " + price + ", 포인트 : " + bonusPoint + ", 채널 : " + ch);
	}
}
