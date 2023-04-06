package chapter3;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // in -> 키보드, out -> 콘솔

		char grade = ' ';
		while (true) {
			System.out.println("성적을 입력하세요.");
			int score = scanner.nextInt();

			if (score > 100 || score < 0) {
				System.out.println("부적절한 점수입니다.");
				break;
			} else if (score >= 90) {
				grade = 'A';
				System.out.println(grade);
			} else if (score >= 80) {
				grade = 'B';
				System.out.println(grade);
			} else if (score >= 70) {
				grade = 'C';
				System.out.println(grade);
			} else if (score >= 60) {
				grade = 'D';
				System.out.println(grade);
			} else {
				grade = 'F';
				System.out.println(grade);
			}
		}
		scanner.close();  // try()도 가능
	}

}