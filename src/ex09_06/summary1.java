package ex09_06;

public class summary1 {

	public static void main(String[] args) {
		// 클래스의 선언 및 사용
		// new -> 클래스 및 참조타입 생성 사용
		Cat cat = new Cat("나비", 1);
		// cat -> name, age 필드가 존재, Cry기능
		// 매개변수가 2개인 생성자로 필드값을 저장
		System.out.println(cat.name + "/" + cat.age);

		// 클래스 -> 메서드 호출
		cat.Cry();
	}

	static void chap04() {
		if (true) {
			System.out.println("true일떄 실행");
		}

		int num = 5;
		switch (num) {
		case 5:
			System.out.println("5입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		default:
			System.out.println("나머지입니다.");
		}

		for (int i = 0; i < 5; i++) {

		}

		int num2 = 0;
		while (num2 < 5) {
			System.out.println("whiletest");
			num2++;
		}

		// do while
		// while 뒤에 ;
		int num3 = 0;
		do {
			// 반복내용
			System.out.println("do while");
			// 증감식
			num3++;
		} while (num3 < 5);
	}

}

//접근 제한자(접근지정자)
// private - 비공개(클래스 내부에서만 사용가능)
// public - 공개 (아무데서나 사용 가능)
// protected - 패키지 안에서 상속관계에 있는 클래스에서 사용가능
// default - 패키지 안에서 사용가능

// 자바에서 소스파일이름과 같은 public클래스는 하나만 존
class Cat {
	// 필드(속성) - 정적인 값
	// 생성자 - 클래스이름() {} -> 기본생성자
	// 매개변수가 있는 생성자 클래스이름(타입 변수이름) -> 어떠한 값을 받아서
	// 필드의 값을 저장해주는 기능
	// this : 필드이름이랑 매개변수 이름이랑 같을 때 헷갈리지 않기 위해서 사용
	// 클래스를 의미 -> this.name -> 클래스안의 필드 name
	// 메서드 - 기능
	// void fun() {
	// 호출이되면 실행될 기능
	// }
	String name;
	int age;

	Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void Cry() {
		System.out.println("야옹");
	}

}