package practice;

public class Cafe {
	String cafeName;
	int money;
	
	Cafe(String cafeName){}
	
	void sell(People name, String drink) {
		  		System.out.println(name.peopleName + "님 주문하신 " + drink + " 나왔습니다.");
	}
}