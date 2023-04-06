package chapter3;

public class Test24 {

	public static void main(String[] args) {
		String nation = "KOR";

		switch (nation) {
		case "KOR":
		case "JPN":
		case "CHN":
			System.out.println("Asia");
			break;
		case "GBR":
		case "FRA":
		case "EUA":
			System.out.println("Europe");
			break;
		case "USA":
		case "CAN":
		case "MEX":
			System.out.println("America");
			break;
		}
	}
}