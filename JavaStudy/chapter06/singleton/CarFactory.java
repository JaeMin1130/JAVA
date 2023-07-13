package singleton;

public class CarFactory {
	// 생성자
	private CarFactory() {}
	
	// 메서드
	public Car createCar() {
		return new Car();
	}
	
	// 인스턴스
	private static CarFactory instance = new CarFactory();
	
	// 인스턴스 반환 메서드
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
}