package Quiz;

public class Product_Main {

	public static void main(String[] args) {
		Product product = new Product(1111, 0.3);
		product.print();
		product.setPrice(1000);// 가격 setter 함수이름으로 변경해서 사용
		product.setDc(0.2);// 할인율 setter 함수이름으로 변경해서 사용

		Product tv = new TV2(1000, 0.3, 0.4);
		tv.print();
		tv.setPrice(2000);
		tv.print();

		Product car = new Car(10000, 0.3, 300);
		car.print();
		car.setPrice(20000);
		car.print();

	}
}
