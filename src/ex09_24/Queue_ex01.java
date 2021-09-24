package ex09_24;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_ex01 {

	public static void main(String[] args) {
		// 큐
		// 대기표(줄)
		// -> 먼저 간 사람이 먼저 나온다.
		// FIFO -> 선입선출
		// 첫번째 데이터 (꺼내질 데이터) front
		// 마지막 데이터 rear

		// 장점
		// 데이터의 삽입/삭제가 빠르다
		// 단점
		// 탐색 느리다 - 원소를 하나하나 꺼내서 옮겨가면서 해야한다.
		// queue의 중간에 위치한 요소(데이터)의 접근이 어렵다.

		// 주요 사용법(일반적인 용어)
		// 자바에서는 저장할 때 꺼낼때 메서드 다름
		// 저장할 때 Enqueue
		// 꺼낼 때 Dequeue - 불러오기 X, 데이터 꺼내기(삭제)

		// 큐의 종류 (선형 큐가 일반적인(기본) 큐 나머진 단점을 보완하기 위해 무언가를 추가)
		// Linear Queue (선형큐)
		// Circular Queue(원형큐)
		// Priority Queue(우선순위 큐)

		// 알고리즘 문제
		// BFS문제, 콜센터 대기 순번, 프로세스 관리
		// BFS(너비 우선 탐색), DFS(깊이 우선 탐색) --> 알고리즘 공부
		Queue01();

	}

	private static void Queue01() {
		// 자바에서 Queue 인터페이스 제공 (클래스가 아니다) -> 생성불가
		// 저장할 때 offer
		// 꺼낼 때 poll - 꺼내기(데이터 삭제)
		// 꺼내질 값 확인 peek
		Queue<String> queue = new LinkedList<String>();
		// .offer() 저장
		queue.offer("강감찬"); // "강감찬"
		queue.offer("홍길동"); // "강감찬" "홍길동"
		queue.offer("테스트"); // "강감찬" "홍길동" "테스트"
		System.out.println(queue.peek());
		// 여전니 "강감찬" "홍길동" "테스트"

		// .poll() - 데이터 꺼내기(데이터삭제)
		System.out.println(queue.poll());
		// "홍길동" "테스트"
		queue.offer("이순신"); // "홍길동" "테스트" "이순신"

		// .size 크기
		System.out.println(queue.size());

		// .isEmpty() 비어있는지 확인
		boolean isEmpty = queue.isEmpty();
		System.out.println(isEmpty);

		// .contains("값") 요소가 있는지 체크
		boolean isContain = queue.contains("이순신");
		System.out.println(isContain);

		// queue -> 비어있는지 확인 -> 비었으면 true, 요소가 있으면 false
		// while(조건) 조건 true 반복 false 반복 X
		// !논리 부정 true -> false false -> true
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

	}

}
