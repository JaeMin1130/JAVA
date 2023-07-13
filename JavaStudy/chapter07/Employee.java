package chapter7;

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

	// 메서드 오버라이딩
	@Override
	public String toString() {
		return "Employee [name: " + this.getName() + ", age: " + super.getAge() + ", dept: " + this.getDept() + "]";

		// return super.toString() + ", 부서: " + this.getDept();
	}
}