package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		int size = 0;  //  유효한 값이 저장된 배열 요소 갯수를 저장할 변수 선언
		
		arr[0] = 8; size++;
		arr[1] = 4; size++;
		arr[2] = 6; size++;
		
		for(int i = 0; i < size; i++) {
		    int[] newArr = new int[size];
		    newArr[i] = arr[i];
		    System.out.println(newArr[i]);
		}
	}
}