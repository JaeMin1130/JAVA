package practice;

public class Cafe_People {
	public static void main(String[] args) {
	People no1 = new People("Kim", 8000);
	People no2 = new People("Lee", 5000);
	
	Cafe cafe1 = new Cafe("Byeol");
	Cafe cafe2 = new Cafe("kong");
	
	no1.buy("americano", 4000);
	cafe1.sell(no1, "americano");
	
	no2.buy("latte", 4500);
	cafe2.sell(no2, "latte");
	}
}