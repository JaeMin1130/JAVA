package chapter8.polymorphism;

public class Employee extends Person {
	// 필드
	public int salary;
	private String dept;

	// 생성자
	public Employee() {
	}

	public Employee(String name, int age) {
		super(name, age);
	}

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	// 메서드
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}
