package ex09_08;

public class Product {
	int price;
	int bonusPoint;

	Product() {

	}

	Product(int price) {
		System.out.println("부모 생성자");
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}

	public void print() {
		System.out.println("가격 : " + price + ", 포인트 : " + bonusPoint);
	}
}
