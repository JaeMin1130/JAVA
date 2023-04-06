package chapter2;

public class Test15 {
	public static void main(String[] args) {
		
		// 삼항 연산자

		char c = 'F';
		String gender = (c == 'F')? "Female" : "Male";
		System.out.println(gender);
		
		@SuppressWarnings("unused")
		int d = (1 + 2 == 4)? 'A' : 5;
		System.out.println(d);
	}
}