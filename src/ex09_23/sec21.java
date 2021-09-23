package ex09_23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class sec21 {
	public static void main(String[] args) {
		// 15장 컬렉션 프레임워크
		// 컬렉션 - 객체를 수집해서 저장
		// 컬렉션 프레임워크 - java.util 컬렉션과 관련된 인터페이스나 클래스를 총칭

		// List컬렉션
		// 객체를 일렬로 늘어놓은 구조
		// ArrayList, Vector, LinkedList
		// List -> 인터페이스(java.util) -> 부모의 타입으로 사용 가능
		// List -> ArrayList, Vector, LinkedList 구현(상속)

		// ArrayList
		// 내부배열 -> 배열의 특징
		// 배열과 차이점 new int[3] 크기고정
		// + 크기가변 + 삭제 뒤에 인덱스 땡겨짐 + 삽입시 뒤로 밀림현상

		// 예시
		// 값 5 4 3 2
		// 인덱스 0 1 2 3
		// 삭제(1) 5 3 2
		// 0 1 2 3
		// 삽입 5 3 2
		// 0 1 2 3
		// 5 4 3 2
		// 0 1 2 3 4

		// 장점
		// 검색이 빠르다, 맨마지막 객체 추가 빠르다. -> idx로 접근
		// 단점
		// 삽입 , 삭제 느리다
		// ArrayList_ex01();

		// LinkedList
		// 연결리스트
		// 노드 -> 데이터 담거나 표현하는 기본적인 단위
		// 연결 리스트 노드 구조
		// 데이터 영역 -> 값 저장, 포인터영역 -> 연결된 다음 노드를 가르키는 영역(주소값저장)

		// 장점
		// 삽입, 삭제 빠름 -> 포인트 노드가 있어서
		// 단점
		// 검색이 느림 -> 특정 인덱스로 접근 불가 -> 순차적 접근(처음부터)

		// 일반적인 회사 -> 구별 안하는 경우 많음 -> CPU 컴퓨터사양
		// 하지만 실시간, 중요한, 연산 -> 구별을 해야한다.

		// ArrayList랑 LinkedList 장단점 비교
		Example01();

		// Vector -> ArrayList와 동일한 내부구조 -> 배열
		// 차이점 멀티스레드에서 동시 작업 X,
		// 하나의 스레드가 완료 후 다른 스레드에서 실행할 수 있다.
		// 멀티스레드(동시작업환경)에서 안전하게 사용 -> ArrayList보다
	}

	static void Example01() {
		// List 인터페이스 -> 부모타입
		// ArrayList, LinkedList , Vector -> List 인터페이스를 구현(상속)
		List<String> arr_list = new ArrayList<String>();
		List<String> linked_list = new LinkedList<String>();

		// 시작 시간
		long startTime;
		// 종료 시간
		long endTime;

		// System.nanoTime() -> 시간을 가져오는 메서드 (단위는 나노세컨드 ns)
		// ms : 밀리초 0.001 = 10^(-3)초
		// us : 마이크로초 0.000001초 = 10^(-6)초
		// ns : 나노초 0.000000001초 = 10^(-9)초
		startTime = System.nanoTime(); // 시작시간
		// 동작
		for (int i = 0; i < 1000000; i++) {
			// String.valueOf( ) 기본타입-> 문자열로 변환 후 반환
			// 0번째 요소 삽입
			// arr_list.add(0, String.valueOf(i));
			// 마지막 요소 삽입
			arr_list.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList   :  " + (endTime - startTime) + "ns");

		// LinkedList 작업시간 확인
		startTime = System.nanoTime();
		for (int i = 0; i < 1000000; i++) {
			// linked_list.add(0, String.valueOf(i));
			linked_list.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList  :  " + (endTime - startTime) + "ns");
	}

	static void ArrayList_ex01() {
		// <제너릭타입> 리스트 안에 저장되는 요소의 타입 결정
		// 없으면 Object -> 최상위 클래스 -> 꺼낼때(요소 사용할때) 타입변환
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("ab"); // "ab"
		arrlist.add("cd"); // "ab" "cd"
		arrlist.add("ef"); // "ab" "cd" "ef"
		arrlist.remove(2); // "ab" "cd" 2번째idx 삭제

		// ArrayList .size() - 크기(요소갯수)반환
		for (int i = 0; i < arrlist.size(); i++) {
			String result = arrlist.get(i);
			System.out.println(result);

			System.out.println(arrlist.get(i));
		}
	}

}
