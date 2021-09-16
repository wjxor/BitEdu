package ex09_16;

public class Summary08 {
	public static void main(String[] args) {
		// 8장 인터페이스
		// 인터페이스 VS 추상클래스
		// 일반적으로

		// 인터페이스 사용
		// 인터페이스 필드는 public static final만 가능
		// 전체공개, 클래스이름 접근, 값변경 불가능
		// -> 선언과 동시에 값저장

		// 생성자 X (객체생성 X),
		// 타입으로 사용가능 -> 구현된 클래스의 객체를 저장(다형성)

		// 추상 메서드 - 구현받는 객체가 꼭 구현해야하는 메서드
		// 메서드 -> 디폴트메서드, 정적 메서드
		// default 메서드 - default 구분 ==> 구현된객체.메서드()
		// static 메서드 ==> 클래스.메서드()
	}
}
