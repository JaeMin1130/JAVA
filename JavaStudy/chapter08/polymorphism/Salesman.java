package chapter8.polymorphism;


public class Salesman extends Employee {

	public Salesman() {
	}

	Salesman(String name, int salary) {
		super(name, salary);
	}

	public void calcSalary(int alpha) {
		System.out.printf(name + "님의 급여" + "\n기본급: %1d \n판매수당: %1d\n합계: %2d\n\n", salary, alpha, salary + alpha);
//		System.out.println(name + "님의 급여 = " + salary + "(기본급)" + " + " + alpha + "(판매수당)");
	}

	public void calcBonus() {
		System.out.println(name + "님의 보너스 = " + salary + " * " + 12 * 4);
	}
}
