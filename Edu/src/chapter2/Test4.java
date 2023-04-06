package chapter2;

public class Test4 {

	public static void main(String[] args) {
		
		float exchangeRate = 1136.50123467589f;
		double USDAmount = 1234.123456789123456;
		double KRWAmount = 682468.25;

		System.out.println(exchangeRate);
		System.out.println(USDAmount);
		System.out.println(KRWAmount);
		
		int a = 8;
		int b = a++;  // b에 a값을 넣고나서 a+1
		int c = ++a;  // a+1 하고나서 c에 넣음	
		int d = a++;
		System.out.println(a+ ", " + b + ", " + c + ", " + d);
	}
}