package ex09_09;

public class sec12 {
	public static void main(String[] args) {

		// 다형성
		// 한자 -> 많은 형태를 가지는 성질
		// 동일한 타입을 사용하지만 다양한 결과가 나오는 성질
		// 다양한 객체를 이용할 수 있는 성질
		// 하나의 타입에 여러 객체를 대입할 수 있다.
		// 부모타입은 모든 자식 객체가 대입될 수 있다.

		// 클래스타입변환
		// 자동 타입변환
		// 부모클래스 변수 = 자식클래스타입 객체
		// 자식 -> 부모(부모의 부모) 자동으로 타입변환 가능
		// 부모의 타입으로 변하면 객체는 부모에 선언된 필드와 메서드만 호출가능
		// 오버라이드 된 메서드는 자식의 메서드 호출
		// 필드의 다형성
		Pet pet1 = new Pet();
		Pet pet2 = new Cat();
		Dog dog = new Dog();
		Pet pet3 = dog;

		pet1.Sound();
		pet2.Sound();
		pet3.Sound();

		Pet[] pet_arr2 = new Pet[3];
		pet_arr2[0] = new Pet();
		pet_arr2[1] = new Cat();
		pet_arr2[2] = new Dog();

		// 배열로 사용하는 방법
		// 타입[] 변수이름 = new 타입[size];
		System.out.println("배열로 사용하는 방법");
		Pet[] pet_arr = { new Pet(), new Cat(), new Dog() };

		for (int i = 0; i < pet_arr.length; i++) {
			pet_arr[i].Sound();
		}

		for (Pet pet : pet_arr) {
			pet.Sound();
		}

		// 매개변수의 다형성
		// 매개변수에 클래스 들어갈 떄
		System.out.println("매개변수의 다형성");
		printSound(pet1); // Pet
		printSound(pet2); // Cat -> Pet
		Dog dog2 = new Dog();
		printSound(dog2); // Dog -> Pet

		// 강제 타입변환(Casting)
		// 부모 -> 자식 타입을 변환
		// 조건 : 자식 -> 부모 -> 자식
		// 자식타입에서 부모타입으로 자동변환 후 자식으로 다시 바꿀 때 가능
		// <필요한 경우>
		// 자식 타입에 선언된 필드와 메서드를 다시 사용해야할 때
		// (부모로 변환하면 부모의 필드와 메서드만 사용가능해서)
		// pet2.scratch(); // Cat
		// pet3.bite(); // Dog
		System.out.println("강제 타입변환");
		Pet pet4 = new Cat();
		Cat cat = (Cat) pet4;
		cat.scratch();
		// Dog dog3 = (Dog) pet4; // Cat -> Pet -> Dog(에러)
		// dog3.bite();

		// 객체 타입확인
		// 좌측 instanceof 우측
		// 좌측 : 확인하고싶은 객체
		// 우측 : 확인하고싶은 타입
		boolean result = pet4 instanceof Cat;
		if (result) {
			Cat cat2 = (Cat) pet4;
			cat2.scratch();
		}
	}

	static void printSound(Pet pet) {
		pet.Sound();
	}
}

class Pet {
	void Sound() {
		System.out.println("애완동물 울음소리");
	}
}

class Dog extends Pet {

	@Override
	void Sound() {
		System.out.println("멍멍");
	}

	void bite() {
		System.out.println("깨물다");
	}
}

class Cat extends Pet {
	@Override
	void Sound() {
		System.out.println("야옹야옹");
	}

	void scratch() {
		System.out.println("할퀴다");
	}
}