package cooperation;

public class Subway {
	// 멤버 변수
		int lineNumber;
		int passengerCount;
		int money;
		
		// 생성자
		Subway(int lineNumber) {
			this.lineNumber = lineNumber;
		}
		
		// 메서드
		public void take(int money) {
			this.money += money;
			passengerCount++;
		}
		
		public void showInfo() {
			System.out.println(lineNumber + "호선의 승객은 현재 " + passengerCount + "명이고, 수입은" + money + "원 입니다.");
		}
}