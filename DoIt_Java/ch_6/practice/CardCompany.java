package practice;

public class CardCompany {
	private CardCompany() {}
	
	private static CardCompany IBK = new CardCompany();
	
	public static CardCompany getCompany() {
		return IBK;
	}
}