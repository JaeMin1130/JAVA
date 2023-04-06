package chapter2;

public class Test13 {

	public static void main(String[] args) {
		int x = 0b10101010;
		int y = 0b00101111;
		
		int z1 = x | y;  // 10101111
		int z2 = x & y;  // 00101010
		int z3 = x ^ y;	 // 10000101
		byte z4 = (byte)~x; // 01010101 
		
		System.out.println(Integer.toBinaryString(z1));
		System.out.println(Integer.toBinaryString(z2));
		System.out.println(Integer.toBinaryString(z3));
		System.out.println(Integer.toBinaryString(z4));
		
		int f = 12;
		int h = f << 1;
		int i = f >> 1;
		int j = f >>> 3;
		
		System.out.println(Integer.toBinaryString(f));
		System.out.println(Integer.toBinaryString(h));
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString(j));
		
		
	}
}
