package chapter7.abstraction;

abstract class Employee1 {
	String name;
	int salary;

	Employee1(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public abstract void calcSalary(int alpha);

	public abstract void calcBonus();
}

class Salesman1 extends Employee1 {
	Salesman1(String name, int salary) {
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

class Consultant1 extends Employee1 {
	Consultant1(String name, int salary) {
		super(name, salary);
	}

	public void calcSalary(int alpha) {
		System.out.printf(name + "님의 급여" + "\n기본급: %2d \n특별수당: %2d\n합계: %2d\n\n", salary, alpha, salary + alpha);
	}

	public void calcBonus() {
		System.out.println(name + "님의 보너스 = " + salary + " * " + 12 * 4);
	}
}

abstract class Manager1 extends Employee1 {
	Manager1(String name, int salary) {
		super(name, salary);
	}

	public void calcSalary(int alpha) {
		System.out.printf(name + "님의 급여" + "\n기본급: %2d \n성과수당: %2d \n합계: %2d\n\n", salary, alpha, salary + alpha);
	}
}

class Director1 extends Manager1 {
	Director1(String name, int salary) {
		super(name, salary);
	}

	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 4");
	}
}

public class HRSTest1 {
	public static void main(String[] args) {
		Salesman1 s = new Salesman1("김명준", 100);
		Consultant1 c = new Consultant1("이서윤", 1000);
		Director1 m = new Director1("정찬혁", 10000);

		s.calcSalary(20);
		c.calcSalary(50);
		m.calcSalary(30);

	}
}
