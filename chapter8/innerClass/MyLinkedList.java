package chapter8.innerClass;

// 러시아 상자 구조
public class MyLinkedList {
	
// 내부 클래스
	class Node {
		// 필드
		String data;
		Node link;
		
		// 생성자
		public Node(String data) {
			this.data = data;
		}
	}
	
	// 필드
	private Node head = null;

	// 메서드
	public  void add(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node next = head;
			while (next.link != null) {
				next = next.link;
			}
			next.link = newNode;
		}
	}
	public void print() {
		if (head == null) {
			System.out.println("등록된 데이터가 없습니다.");
		} else {
			System.out.println("등록된 데이터는 다음과 같습니다.");
			Node next = head;
			while (next != null) {
				System.out.println(next.data);
				next = next.link;
			}
		}
	}
	public static void main(String[] args) {
		MyLinkedList myList = new MyLinkedList();
		myList.print();
		
		myList.add("java");
		myList.add("JSP");
		myList.add("Servlet");
		
		myList.print();
		
	}
}