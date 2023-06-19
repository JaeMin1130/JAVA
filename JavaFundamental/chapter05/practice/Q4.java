package practice;

public class Q4 {
	public static void main(String[] args) {
		
		Dog[] dogs = new Dog[5];
		dogs[0] = new Dog("가을", "푸들");
		dogs[1] = new Dog("코코", "푸들");
		dogs[2] = new Dog("예삐", "푸들");
		dogs[3] = new Dog("학금", "시츄");
		dogs[4] = new Dog("이루", "폴드");
	
		for(int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i].showDogInfo());
		}
		
		System.out.println();
		
		for(Dog list : dogs) {
			System.out.println(list.showDogInfo());
		}
	}
}