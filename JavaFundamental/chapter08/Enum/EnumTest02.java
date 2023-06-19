package chapter8.Enum;

enum Mandarin{
	금귤, 한라봉, 레드향, 천혜향, 황금향
}

// Enum 클래스에 선언된 메서드

public class EnumTest02 {
	public static void main(String[] args) {
		
		Mandarin ma1 = Mandarin.한라봉;
		
		// name() = toString() : 열거 상수의 이름 반환
		System.out.println("이름 : " + ma1.name());
		
		// ordinal() : 열거 상수의 위치값을 반환
 		System.out.println("위치 : " + ma1.ordinal());
 		
 		// compareTo() : 열거 상수의 상대적 위치를 구함
		System.out.println("황금향과의 상대 위치 : " + ma1.compareTo(Mandarin.황금향));
		
		// valueOf() : 인자로 지정한 이름의 열거 상수를 반환
		Mandarin ma2 = Mandarin.valueOf("레드향");
		System.out.println("\n" + ma2);
		
		// values() : 모든 열거 상수 반환
		Mandarin[] list = Mandarin.values();
		System.out.println("\n=== 귤의 종류 ===");
		
		for(Mandarin i : list) {
			System.out.print(i + " ");
		}
		
	}
}
