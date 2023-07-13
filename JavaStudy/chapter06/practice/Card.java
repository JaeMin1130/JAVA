package practice;

public class Card {
	public static int serialNum = 0;
	String cardName;
	int cardNum;
	
	Card(String name) {
		cardName = name;
		serialNum++;
		cardNum = serialNum;		
	}
	
	void showInfo() {
		System.out.println(cardName + " 카드번호 : " + cardNum);
	}
}