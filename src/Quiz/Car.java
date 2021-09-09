package Quiz;

public class Car extends Product {
	int tax;

	Car(int price, double dc, int tax) {
		super(price, dc);
		this.tax = tax;
	}

	@Override
	public void print() {
		System.out.println("할인가격 : " + ((price * dc) - tax) + ", 포인트 : " + price / 10);
	}

} 
