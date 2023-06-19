package cooperation;

public class Bus {
	// 멤버 변수
	int busNumber;
	int passengerCount;
	int money;
	
	// 생성자
	Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// 메서드
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(busNumber + "번의 승객은 현재 " + passengerCount + "명이고, 수입은" + money + "원 입니다.");
	}
}