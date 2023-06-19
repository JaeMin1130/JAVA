package practice;
import java.util.ArrayList;

public class Q5 {
	public static void main(String[] args) {
		
		DogArrayList list = new DogArrayList();
		list.dogList = new ArrayList<Dog>();
	
		list.addDog("가을", "푸들");
		list.addDog("코코", "푸들");
		list.addDog("예삐", "푸들");
		list.addDog("학금", "시츄");
		list.addDog("이루", "폴드");
		
		list.showInfo();
		
		list.dogList.get(1);
	}
}