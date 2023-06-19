package singleton;

public class Company {
	String name;
	
	// 단계 1 : private 생성자 만들기 
	private Company(String name) {
		this.name = name;
	}
	
	// 단계 2 : 클래스 내부에 static으로 유일한 인스턴스 생성하기
	private static Company instance = new Company("Samsung");
	
	// 단계 3 : 외부에서 참조할 수 있는 public 메서드 만들기
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company("LG");
		}
		return instance;
	}
}