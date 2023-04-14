package chapter7;

public class Student extends Person {
	// 필드
	private String major;

	// 생성자
	public Student() {
	}

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	// 메서드
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	// 메서드 오버라이딩
	@Override
	public String toString() {
		return "Student [name: " + this.getName() + ", age: " + super.getAge() + ", major: " + this.getMajor() + "]";

		// return super.toString() + ", 전공: " + this.getMajor();
	}
}
