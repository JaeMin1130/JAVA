package static_ex;

public class Student1 {
	// 멤버 변수
	public static int serialNum = 201606152;
	public int studentID, grade;
	public String studentName, address;
	
	// 생성자
	public Student1() {
		serialNum++;              // 학생이 생성될 때마다 증가
		studentID = serialNum;
	}
	
	// 메서드
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name; 
	}
}