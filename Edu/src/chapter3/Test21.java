package chapter3;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("연산자를 입력하세요.");
		char op = scanner.next().charAt(0); // String을 받아서 char로 변환
		int a = 12;
		int b = 2;

		// 조건식에 값 하나만 있으면 될 때 사용
		switch (op) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
		default:
			System.out.println("\'+, -, *, /\' 중에 하나를 입력하세요.");
		}

		scanner.close();
	}
}