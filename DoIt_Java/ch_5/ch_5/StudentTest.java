package ch_5;
public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(201606168, 3, "울산광역시");
		studentLee.setStudentName("이서윤");	
		System.out.println(studentLee.studentName);
		System.out.println(studentLee.getStudentName());
		
		Student eru = new Student();
		eru.korean.name = "글쓰기";
		eru.math.name = "미적분";		
	}
}