package ex09_17;

public class SinglyLinkedList { // 56 ~ 58.p

	private Node head;

	SinglyLinkedList() {
		this.head = null;
	}

	SinglyLinkedList(int value) {
		this.head = new Node(value, null);
	}

	class Node {
		private int value;
		private Node next;

		Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

		public int getValue() {
			return this.value;
		}
	}

	public Node getHead() {
		return this.head;
	}

	// 노드 추가기능
	public void append(int value) {
		// 시작노드 == null -> 시작노드 객체 생성 x
		if (this.head == null) {
			this.head = new Node(value, null);
			return;
		}

		// while의 조건을 거짓으로 바꾸는 변수
		Node pointer = this.head; // pointer -> 시작 노드
		while (pointer.next != null) { // 시작노드 다음 노드 -> null이 아니면
			pointer = pointer.next; // 포인트 -> 다음 노드
		}

		pointer.next = new Node(value, null);
	}

	// 전체조회
	public void printAll() {
		// 시작 노드
		Node pointer = this.head; // pointer -> Node클래스 -> value 값, next 다음 노드 객체
		String str = "";

		while (pointer.next != null) {
			str += pointer.getValue();
			str += " -> ";
			pointer = pointer.next;
		}

		str += pointer.getValue();
		System.out.println(str);
	}

	public void delete(int value) {
		Node pointer = this.head;

		if (pointer.getValue() == value) {
			Node removeNode = this.head;
			this.head = this.head.next;

			removeNode = null;
			return;
		}

		// 시작노드 빈공간 temp 임시저장
		Node temp = pointer;

		// pointer(처음반복 -> 시작노드)가 객체가 있고 pointer 값(value) 입력받은 값과 같지 않을 때

		// 포인터(처음객체 ~ 마지막객체) 마지막객체까지 반복되거나, 입력받은 값하고 같은 값이 있을때까지 반복
		while (pointer != null && pointer.getValue() != value) {
			temp = pointer;
			pointer = pointer.next; // 포인터(현재 객체) 다음 객체
		}

		// 마지막 객체
		if (pointer.next == null) {
			temp.next = null;
		} else {
			temp.next = pointer.next;
		}
		pointer = null;
	}

}
