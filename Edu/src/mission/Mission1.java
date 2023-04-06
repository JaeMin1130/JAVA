package mission;

import java.util.Scanner;

public class Mission1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			// 학생 번호
			int studentNum = 1;

			// 점수 입력
			System.out.println("국어 점수를 입력하세요.");
			int korean = scanner.nextInt();
			System.out.println("수학 점수를 입력하세요.");
			int math = scanner.nextInt();
			System.out.println("영어 점수를 입력하세요.");
			int english = scanner.nextInt();

			// 과목 평균
			int avg = (korean + math + english) / 3;

			// 통과 or 과락
			if (korean > 100 || math > 100 || english > 100 || korean < 0 || math < 0 || english < 0) {
				System.out.println("과목 점수는 100점을 넘거나, 음수가 될 수 없습니다.");
			} else if (korean < 60 || math < 60 || english < 60) {
				System.out.println(studentNum + "번 학생은 과락입니다.");
				studentNum++;
			} else if (avg >= 70) {
				System.out.println(studentNum + "번 학생은 과목 평균 " + avg + "점으로 통과입니다.");
				studentNum++;
			} else {
				System.out.println(studentNum + "번 학생은 과목 평균 " + avg + "점으로 과락입니다.");
				studentNum++;
			}

			// 계속 or 종료
			System.out.println("\n계속하려면 1, 종료하려면 2를 입력하세요.");
			int i = scanner.nextInt();
			if (i == 1) {
				continue;
			} else {
				System.out.println("\n프로그램을 종료합니다.");
				break;
			}
		}
		scanner.close();
	}
}