package chapter8.polymorphism;

public class Director extends Manager {
	public Director() {
	}

	Director(String name, int salary) {
		super(name, salary);
	}

	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 4");
	}
}
