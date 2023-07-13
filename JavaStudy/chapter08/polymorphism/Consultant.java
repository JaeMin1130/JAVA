package chapter8.polymorphism;


public class Consultant extends Employee {

	Consultant() {

	}

	Consultant(String name, int salary) {
		super(name, salary);
	}

	public void calcSalary(int alpha) {
		System.out.printf(name + "님의 급여" + "\n기본급: %2d \n특별수당: %2d\n합계: %2d\n\n", salary, alpha, salary + alpha);
	}

	public void calcBonus() {
		System.out.println(name + "님의 보너스 = " + salary + " * " + 12 * 4);
	}
}
