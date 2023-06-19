package chapter8.polymorphism;

public class Manager extends Employee {
	Manager() {

	}

	Manager(String name, int salary) {
		super(name, salary);
	}

	public void calcSalary(int alpha) {
		System.out.printf(name + "님의 급여" + "\n기본급: %2d \n성과수당: %2d \n합계: %2d\n\n", salary, alpha, salary + alpha);
	}

}
