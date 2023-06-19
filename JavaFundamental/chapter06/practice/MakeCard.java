package practice;

public class MakeCard {
	public static void main(String[] args) {
		
		CardCompany visa = CardCompany.getCompany();
		
		Card no1 = new Card("Shinhan");
		Card no2 = new Card("BC");
		System.out.println(visa);
		no1.showInfo();
		no2.showInfo();
	}
}