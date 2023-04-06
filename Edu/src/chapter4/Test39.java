package chapter4;

public class Test39 {

	public static void main(String[] args) {
		int[][] arr = { {1, 2, 3, 4, 5},
						{6, 7, 8, 9, 10},
						{11, 12, 13, 14, 15},
						{16, 17, 18, 19, 20},
						{21, 22, 23, 24, 25} };
		
		// 대각선 합 구하기1
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					sum += arr[i][j];
				}
			}
		}
		System.out.println("합계 : " + sum);
		
		// 대각선 합 구하기2
		int sum1 = 0;
		for (int i = 0; i < arr.length ; i++) {
			sum1 += arr[i][i];
		}
		System.out.println("합계 : " + sum1);
		System.out.println();
		
		// 왼쪽 삼각형 순회
		int sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
					sum2 += arr[i][j];
					System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.println("\n" + "합계 : " + sum2);
	}
}