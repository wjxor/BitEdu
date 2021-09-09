package Quiz;

public class Product {
	int price;
	double dc;

	Product(int price, double dc) {
		this.price = price;
		this.dc = dc;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDc() {
		return dc;
	}

	public void setDc(double dc) {
		this.dc = dc;
	}

	public void print() {
		System.out.println("할인가격 : " + price * dc + ", 포인트 : " + price / 10);
	}
}
