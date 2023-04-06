package chapter2;

public class Test14 {

	public static void main(String[] args) {
		
		char c = 'A';
		System.out.println("c: " + c);
		System.out.println("c = " + (c-0));
		System.out.println("c = " + Integer.toBinaryString(c));
		System.out.println("(1 << 5) = " +Integer.toBinaryString(1 << 5));
		System.out.println("----------------------");
		
		c ^= (1 << 5);   // c = c ^ (1 << 5)
		System.out.println("c: " + c);
		System.out.println("c = " + (c-0));
		System.out.println("c = " + Integer.toBinaryString(c));
	}

}
