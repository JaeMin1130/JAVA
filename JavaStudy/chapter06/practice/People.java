package practice;

public class People {
	String peopleName;
	int money;
	
	People(String name, int money) {
		this.peopleName = name;
		this.money = money;
	}
	
	public void buy(String drink, int price) {
		money -= price;
		System.out.println(money + "원 남았네.");
	}	
}