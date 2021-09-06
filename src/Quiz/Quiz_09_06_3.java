package Quiz;

public class Quiz_09_06_3 {

	public static void main(String[] args) {
		Cal.plus(3, 4);
		Cal.mul(3, 4);

		Cal cal_val = new Cal();
		cal_val.minus(5, 3);
		cal_val.div(5, 3);
	}

}

// 위에 main의 에러가 사라지게 클래스 안에 메서드를 작성
class Cal {

	public static int plus(int i, int j) {
		return i + j;
	}

	public int div(int i, int j) {
		return i / j;
	}

	public int minus(int i, int j) {
		return i - j;
	}

	public static int mul(int i, int j) {
		return i * j;
	}
}
