package ex09_06;

public class ex10 {
	public static void main(String[] args) {
		Car myCar = new Car();

		// 잘못된 속도 변경
		myCar.setSpeed(-50);

		System.out.println("현재 속도 : " + myCar.getSpeed());

		// 올바른 속도 변경
		myCar.setSpeed(60);

		// 멈춤
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}

		System.out.println("현재 속도 : " + myCar.getSpeed());
	}
}

// 267~268.p
class Car {
	private int speed;
	private boolean stop;
	private String color;
	private String car_type;
	private int price;

	// getter
	public int getSpeed() {
		return speed;
	}

	// setter
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	// getter
	public boolean isStop() {
		return stop;
	}

	// setter
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = speed;
	}

}