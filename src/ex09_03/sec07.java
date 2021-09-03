package ex09_03;

// 소스파일 하나에는 public 클래스 한개만 가능
public class sec07 {
	public static void main(String[] args) {
		Cat nunu = new Cat();
		String str = nunu.color;
		String str2 = nunu.name;

		System.out.println("color = " + str + "/name = " + str2);

		nunu.color = "빨간색";
		nunu.name = "키티";
		System.out.println("color = " + nunu.color + "/name = " + nunu.name);

		nunu.age = 17;
		System.out.println("나이는 " + nunu.age);
		nunu.cry();
		nunu.print();

		// Dog 사용해서 각 필드에 값을 저장하고 출력
		Dog bori = new Dog();
		bori.name = "보리";
		bori.age = 3;
		bori.color = "black";
		bori.type = "포메라니안";

		System.out.println("강아지의 이름 : " + bori.name);
		System.out.println("강아지의 나이 : " + bori.age);
		System.out.println("강아지의 색 : " + bori.color);
		System.out.println("강아지의 종 : " + bori.type);

		Cat cat2 = new Cat();
		cat2.name = "네로";
		cat2.age = 2;
		cat2.type = "검정고양이";
		System.out.println("이름 : " + cat2.name + "/나이 : " + cat2.age + "/type : " + cat2.type);
		cat2.cry();
		cat2.print();

		Cat cat3 = new Cat("빨강고양이", 3, "호랭이");
		System.out.println("이름 : " + cat3.name + "/나이 : " + cat3.age + "/type : " + cat3.type);
		cat3.cry();
		cat3.print();
	}

}

// 클래스 선언
// Dog
// 필드 name, age, color, type
class Dog {
	String name;
	int age;
	String color;
	String type;
}

// 클래스 선언
// Cat
class Cat {
	// 생성자가 없어서 기본 생성자 생성
	// Cat()

	// 필드
	String name;
	public String color;
	// 필드 private - 비공개
	// private int age;
	public int age;
	public String type;

	// 접근 제한자 - public, private, default, protected
	// public -> 모든 접근 허용
	// private -> 현재 클래스 안에서만 허용
	// default -> 접근제한자 없는 필드 -> 같은 패키지안에서 허용
	// protected -> 같은 패키지 안에서 상속관계에 있는 클래스에서 허용

	// 기본생성자(표현)
	Cat() {
		System.out.println("Cat 생성자 실행");
	}

	Cat(String name, int age, String type) {
		// this -> 클래스
		this.name = name;
		this.age = age;
		this.type = type;
	}

	// void ---- 함수의 리턴값이 없을 떄 사용
	// 리턴값이 있을때는 리턴되는 값의 타입과 일치
	public void cry() {
		System.out.println("야옹");
	}

	// print 출력
	public void print() {
		System.out.println("이름 : " + name + "/나이 : " + age + "/type : " + type);
	}
}