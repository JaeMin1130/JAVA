package array_list;

public class StudentTest {

	public static void main(String[] args) {
		Student no1 = new Student("Lee");
		no1.addSubject("수학", 87);
		no1.addSubject("영어", 64);
		no1.addSubject("사회", 97);
		
		no1.showStudentInfo();
	}
}