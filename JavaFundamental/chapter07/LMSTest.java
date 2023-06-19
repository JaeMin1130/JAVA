package chapter7;

public class LMSTest {

	public static void main(String[] args) {
		
		// 기본 생성자
		Employee e = new Employee();
		Professor p = new Professor();
		Student s = new Student();
		
		e.setName("오정임");
		e.setAge(47);
		e.setDept("입학처");
		
		p.setName("김푸름");
		p.setAge(52);
		p.setSub("빅데이터");
		
		s.setName("김유빈");
		s.setAge(20);
		s.setMajor("컴퓨터과학");
		
		System.out.println(e);
		System.out.println(p);
		System.out.println(s);

		// 오버로딩한 생성자
		Employee e1 = new Employee("오정임", 47, "입학처");
		Professor p1 = new Professor("김푸름", 52, "빅데이터");
		Student s1 = new Student("김유빈", 20, "컴퓨터과학");

		System.out.println(e1);
		System.out.println(p1);
		System.out.println(s1);
	}
}
