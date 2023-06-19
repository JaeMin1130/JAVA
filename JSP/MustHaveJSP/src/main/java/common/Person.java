package common;

public class Person {
	// 필드
	private String name;
	private int age;
	
	// 생성자
	public Person(){}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// 메서드
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
