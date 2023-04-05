package ch_5;
public class Person {
	int age, childNum;
	String name;
	boolean married;
	
	public static void main(String[] args) {
		Person no1 = new Person();
		no1.age = 40;
		no1.name = "James";
		no1.married = false;
		no1.childNum = 3;
		
		System.out.println("나이: " + no1.age);
		System.out.println("이름: " + no1.name);
		System.out.println("결혼 여부: " + no1.married);
		System.out.println("자녀 수: " + no1.childNum);
	}
}