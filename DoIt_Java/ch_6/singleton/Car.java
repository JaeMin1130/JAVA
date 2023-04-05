package singleton;

public class Car {
	// 변수
	static int serialNum = 10001;
	int carNum;
	
	// 생성자
	Car(){
		serialNum++;
		carNum = serialNum;
	}
	
	// 메서드
	int getCarNum() {
		return carNum;
	}
}