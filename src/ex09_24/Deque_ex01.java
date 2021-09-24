package ex09_24;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_ex01 {
	public static void main(String[] args) {
		// 데크, 덱
		// Deque
		// 큐랑 비슷
		// 큐 - 한쪽에서 삽입, 다른 한쪽에서 추출
		// 데크 - 양쪽에서 삽입, 추출 가능

		// 장점
		// 양끝 데이터의 삽입과 삭제가 빠르다
		// 앞, 뒤에서 데이터를 삽입/삭제 할 수 있다.

		// 단점
		// 구현이 어렵다.
		// 중간에서의 삽입/삭제가 어렵다.

		// 사용할떄
		// 앞과 뒤에서 삽입, 삭제가 자주 일어나는 경우

		// 주요 사용법
		// 저장할때 offerFirst() 앞쪽저장, offerLast() 뒤쪽 저장, offer - offerlast()동일
		// 꺼낼때 pollFirst() 앞쪽꺼내기, pollLast() 뒤쪽 꺼내기, poll-pollFirst()동일
		// 꺼내질 값 확인 Peek
		Deque01();
	}

	private static void Deque01() {
		// 자바에서 Deque 인터페이스 지원 (클래스 아님) -> 생성불가
		// Deque타입은 Deque를 구현한 친구들을 받을 수 있다.
		Deque<String> deque = new ArrayDeque<String>();
		deque.offerFirst("1"); // "1"
		deque.offerFirst("2"); // "2" "1"
		deque.offerFirst("3"); // "2" "1" "3"
		deque.offer("4"); // "2" "1" "3" "4"

		// poll
		System.out.println(deque.pollFirst()); // 2 // "1" "3" "4"
		System.out.println(deque.pollLast()); // 4 // "1" "3"
		System.out.println(deque.pollLast()); // 3 // "1"

		deque.offer("5"); // "1" "5"
		// isEmpty() -> 비어있는지 확인 비었으면 true, 요소가 있으면 false
		while (!deque.isEmpty()) {
			System.out.println(deque.poll()); // 앞에서부터 1, 5
		}
	}
}
