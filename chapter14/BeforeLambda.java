package chapter14;

interface MyInterface {
	public void print();
}

class MyClass1 implements MyInterface {
	@Override
	public void print() {
		System.out.println("MyClass1");
	}
}

public class BeforeLambda {

	public static void test1(MyInterface mi) {
		mi.print();
	}

	public static MyInterface test2() {
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("test2() 메서드에서 반환된 MyInterface");
			}
		};
		return mi;
	}

	public static void main(String[] args) {
		MyClass1 mc1 = new MyClass1();
		mc1.print();
		test1(mc1); // 다형성 적용

		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("익명 클래스로 구현");
			}
		};

		mi.print();
		test1(mi);

		new MyInterface() {
			@Override
			public void print() {
				System.out.println("선언, 생성, 호출을 한 번에 처리");
			}
		}.print();

		MyInterface mi2 = test2();
		mi2.print();
		
		MyInterface mi3 = () -> {System.out.println("람다식");};
		mi3.print();
	}
}
