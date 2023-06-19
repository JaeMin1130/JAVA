package practice;

public class Q3 {

	public static void main(String[] args) {
		int[] array = new int[5];
		for(int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				array[i/2 - 1] = i;
			}
		}
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		System.out.print(array[i] + " ");
		}
		System.out.println(sum);
	}
}