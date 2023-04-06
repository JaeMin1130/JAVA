package chapter4;

import java.util.ArrayList;
import java.util.Scanner;

public class Test37 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> scoreArr = new ArrayList<Integer>();

		System.out.println("학생 수를 입력하세요.");
		int studentNum = scanner.nextInt();
		for (int i = 0; i < studentNum; i++) {
			System.out.println((i + 1) + "번째 점수를 입력하세요.");
			int score = scanner.nextInt();
			scoreArr.add(score);
		}
		scanner.close();
		int sum = 0;
		double avg = 0.0;
		int max = 0;
		int min = 0;
		for (int i = 0; i < scoreArr.size(); i++) {
			sum += (int) scoreArr.get(i);
			if (max < (int) scoreArr.get(i))
				max = (int) scoreArr.get(i);
			if (min > (int) scoreArr.get(i))
				min = (int) scoreArr.get(i);
		}
		avg = (double)sum / (double)studentNum;
		System.out.printf("average:%3.1f ", avg);
	}
}