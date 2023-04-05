package this_ex;
public class BirthDay {
	// 멤버 변수
	int day, month, year;
	
	// 생성자
	public BirthDay() {};
	
	// 메서드
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(1997);
		System.out.println(bDay); // 힙 메모리의 인스턴스 주소값 
		bDay.printThis(); // this = bDay
	}
}