package chapter8.innerClass;

interface Messenger {
	String getMessage();
	void setMessage(String msg);
}

public class AnonymousClass {
	public static void main(String[] args) {
		
		// 익명 클래스 구현
		Messenger test = new Messenger() {
			
			// 인터페이스 'Messenger'의 메서드 오버라이딩 
			public void setMessage(String msg) {
				System.out.println("test에서 메시지를 설정합니다 : " + msg);
			}
			
			public String getMessage() {
				return "test";
			}
		};
		
		System.out.println(test.getMessage());
		test.setMessage("have a nice day!");
	}
}
