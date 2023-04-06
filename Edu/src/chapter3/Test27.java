package chapter3;

public class Test27 {

	public static void main(String[] args) {

		// for문
		for (int i = 10; i < 10; i++) {
			System.out.println("for OK");
		}
		int i = 10;

		// while문
		while (i < 10) {
			System.out.println("while OK");
			i++;
		}

		// do-while문
		int k = 10;
		do {
			System.out.println("do-while OK");
			k++;
		} while (k < 10);
	}
}