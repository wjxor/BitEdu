package ex09_08;

public class SupersonicAirplane extends Airplane {
	// static 객체 생성 X -> 클래스이름으로 접근가능 -> 모든 객체 공통으로 사용할때 쓴다
	// final -> 한번 값이 저장되면 변경 불가
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override // -> 좀 더 안전하게 의도한 코딩을 도와준다.
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			// Airplane 객체의 fly 호출
			super.fly();
		}
	}
}
