package chapter7;

public class Professor extends Person {
	// 필드
	private String subject;

	// 생성자
	public Professor() {
	}

	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	// 메서드
	public String getSub() {
		return subject;
	}

	public void setSub(String subject) {
		this.subject = subject;
	}

	// 메서드 오버라이딩
	@Override
	public String toString() {
		return "Professor [name: " + this.getName() + ", age: " + super.getAge() + ", subject: " + this.getSub() + "]";
		// return super.toString() + ", 과목: " + this.getSub();
	}
}
