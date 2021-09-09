package Quiz;

public class TV2 extends Product {
	double sdr;

	TV2(int price, double dc, double sdr) {
		super(price, dc);
		this.sdr = sdr;
	}
	
	@Override
	public void print() {
		System.out.println("할인가격 : " + price * sdr + ", 포인트 : " + price / 10);
	}

}
