package chapter8.Enum;

enum Mandarin1{
	금귤(600), 한라봉(500), 레드향(300), 천혜향(400), 황금향(800);
	
	// 필드
	private int price;
	private String place;
	
	// 생성자
	Mandarin1(){}
	
	Mandarin1(int p){
		price = p;
	}
	
	// 메서드
	int getPrice() {
		return price;
	}
}
public class EnumTest03 {
	public static void main(String[] args) {
		
		Mandarin1 ma = Mandarin1.한라봉;
		if(ma == Mandarin1.한라봉) {
			System.out.println("ma는 한라봉입니다.");
		}
		System.out.println(ma + " 가격 : " + ma.getPrice());
		
		Mandarin1[] list = Mandarin1.values();
		System.out.println("=== 귤의 종류 ===");
		for(Mandarin1 i : list) {
			System.out.printf( i + " : " + i.getPrice()+"\n");
		}
			
	}
}
