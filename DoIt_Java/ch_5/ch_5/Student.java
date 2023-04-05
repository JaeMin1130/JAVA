package ch_5;

public class Student {
	// 멤버 변수
		int studentID;
		String studentName;
		int grade;
		String address;
		
		// 클래스 자료형 변수로 선언하기
		Subject korean;
		Subject math;
		
	// 생성자
	public Student() {}   // 디폴트 생성자 추가
	
	public Student(int studentID, int grade, String address) {
		this.studentID = studentID;
		this.grade = grade;
		this.address = address;
	}
	public Student(Subject korean, Subject math) {
		this.korean = korean;
		this.math = math;
	}
	// 메서드
	public String getStudentName() {
		return studentName;
		}
	public void setStudentName(String name) {
		studentName = name;
		}
	
	// Student 클래스에 main() 함수 포함하기 -> 클래스가 제대로 수행되는지 알아보기 위함.
	public static void main(String[] args) {
		Student studentKim = new Student(201606154, 6, "부산광역시"); // Student 클래스의 인스턴스(객체) 생성
		studentKim.studentName = "김재민";
		
		System.out.println(studentKim.studentName);
		System.out.println(studentKim.getStudentName());
	}
}