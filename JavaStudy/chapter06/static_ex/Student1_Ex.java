package static_ex;

public class Student1_Ex {
	public static void main(String[] args) {
		Student1 no1 = new Student1();
		Student1 no2 = new Student1();
		
		no1.setStudentName("김시환");
		no2.setStudentName("김재민");
		System.out.println(no1.studentID);
		System.out.println(no2.studentID);
		System.out.println(Student1.serialNum); // static 변수는 클래스 이름으로도 참조하여 사용할 수 있다.
		 }
}