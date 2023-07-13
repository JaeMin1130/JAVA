package practice;
import java.util.ArrayList;

public class DogArrayList {
	ArrayList<Dog> dogList;
	
	public void addDog(String name, String type) {
		Dog dog = new Dog(name, type);
		dogList.add(dog);
	}
	
	public void showInfo() {
		for(int i = 0; i < dogList.size(); i++) {
			dogList.get(i);
		}
	}
}