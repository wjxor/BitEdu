package test;

public class test {

	public static void main(String[] args) {
		fun3();
		fun2();

	}

	public static void fun() {
		System.out.println("fun() 함수 실행");

	}

	public static void fun2() {
		fun3();
		System.out.println("fun2() 함수 실행");
	}

	public static void fun3() {
		System.out.println("fun3() 함수 실행");
		fun();
	}

}
