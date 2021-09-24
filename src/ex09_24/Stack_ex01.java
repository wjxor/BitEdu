package ex09_24;

import java.util.Stack;

public class Stack_ex01 {

	public static void main(String[] args) {
		// 스택
		// 컵 모양 생각
		// -> 먼저 저장한것이 아래 나중에 저장한것이 위
		// -> 꺼낼때는(삭제) 위에서 부터

		// LIFO - Last In First Out
		// 선입후출
		// 후입선출
		// 최상위 데이터(다음 나올데이터) -> Top이라 부름

		// 사용할때
		// 역추적을 해야할때(ex. 문서 작업시 실행취소)
		// 히스토리(앱, 웹페이지 -> 이저페이지, 다음페이지, 방문순서 등) 관리 할 때 사용

		// 네이버 -> 다음 -> 구글 -> 카카오
		// 이전페이지를 관리 -> 네이버 -> 다음 -> 구글
		// 이전 -> 구글 -> -> 다음 -> 네이버

		// 주요 사용법
		// 저장할때 push
		// 꺼낼때 pop -> 불러오기X -> 데이터 꺼내기(삭제)
		// 다음에 꺼내질 값 확인 peek

		// 알고리즘 문제
		// 괄호 검사, 역순 문자열 만들기, 후위 표기법으로의 변환 등

		// 오류
		// 자료가 없을 때 pop하는 요류 -> stack underflow
		// 스택의 크기 이상의 자료를 push 하려 할때 오류 -> stack overflow
		//
		// | 4 |
		// | 3 |
		// | 2 |
		// |___1____|
		//

		Stack01();
	}
	// 원리가 궁금하거나 배운내용으로 만들어 보고싶은 사람 -> 책(배열,연결리스트) 참고

	// 자바에서 제공해주는 스택 구조 사용
	static void Stack01() {
		// <제네릭타입> -> 저장되는 타입이 <제네릭타입> 일반적으로 생각
		Stack<Integer> stack = new Stack<Integer>();
		// push 데이터(요소) 저장
		stack.push(1); // 1
		stack.push(2); // 1 2
		stack.push(3); // 1 2 3
		stack.push(4); // 1 2 3 4

//      for(int i=0; i<stack.size(); i++) {
//         int num = stack.pop();
//         System.out.println(num);
//      }
		// 출력은?
		// 4
		// 3
		// 2
		// 1

		// size 스택의 크기
		int size = stack.size();
		System.out.println("pop 이전 size : " + size); // 4

		int data1 = stack.pop();
		System.out.println(data1); // 4

		// 스택 pop -> size 감소
		size = stack.size();
		System.out.println("pop 이후 size : " + size);

		stack.pop();
		int data2 = stack.pop();
		System.out.println(data2);
		size = stack.size();
		System.out.println("pop 이후 size: " + size);

		// 마지막 값(다음 나올 데이터값 확인) -> 요소가 삭제 X
		int data3 = stack.peek(); // 1
		System.out.println(data3);
		System.out.println("peek 이후 size" + stack.size());// 1

		// 스택 1
		// .contains() -> 매개변수로 들어간 요소가 스택에 있는지 확인
		boolean iscontain = stack.contains(1);
		System.out.println("contains: " + iscontain);

		// .clear() - 스택 초기화(전체삭제)
		stack.clear();
		System.out.println("clear: " + stack.size());

		// .isEmpty() -> 비어있는지 확인 -> 비어있으면 true, 요소(데이터) 있으면 false
		boolean isempty = stack.empty();
		System.out.println("empty() : " + isempty);

		// 반복해서 출력 - Quiz

		// 불편해서 잘안사용함 강제로 (int) 해줘야함
		Stack stack2 = new Stack();
		stack2.push(1);
		int num = (int) stack2.pop();
	}

	static void Stack02() { // ***시험문제 출제
		Stack<String> stack = new Stack<String>();
		stack.push("a");
		stack.pop();
		stack.push("b");
		stack.clear();
		stack.push("c");
		stack.push("d");
		stack.pop();
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		// 출력 결과값을 쓰시오.
	}

}
