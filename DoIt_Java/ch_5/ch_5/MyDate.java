package ch_5;
public class MyDate {
	// 멤버 변수
	private int day, month, year;

	// 생성자
	public MyDate() {}
	MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	// 메서드
	public boolean isValid() {
		if(month == 2) {
			if(day <= 0 || day > 28) {
				System.out.println("유효하지 않은 날짜입니다.");
				return false;
			} else {
				System.out.println("유효한 날짜입니다.");
				return true;
			}
		}
		else {
			System.out.println("유효한 날짜입니다.");
			return true;
		}
	}	
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(month == 2) {
			if(day <= 0 || day > 28) {
				System.out.println("2월은 28일까지입니다.");
			}else this.day = day;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month >12) {
			System.out.println("1 ~ 12 사이의 숫자를 입력해주세요.");
		}
		else {this.month = month;
		}
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}	
}

	