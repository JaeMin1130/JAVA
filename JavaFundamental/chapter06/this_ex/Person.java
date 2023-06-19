package this_ex;

public class Person {
	// 멤버 변수
	String name;
	int age;
	
	// 생성자
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person() {
		this("이름 없음", 1);  // this를 사용해 Person(String, int) 생성자 호출, 제일 위에 써야 함.
	}
	
	// 메서드
	Person returnItSelf() {
		return this;
	}
	
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf(); // this 값을 클래스 변수에 대입 
		System.out.println(p);			  // noName.returnItSelf()의 반환 값 출력
		System.out.println(noName);		  // 참조 변수 출력
	}
}