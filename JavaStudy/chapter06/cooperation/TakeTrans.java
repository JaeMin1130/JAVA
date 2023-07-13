package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student no1 = new Student("James", 5000);
		Student no2 = new Student("Tomas", 3000);
		Bus bus307 = new Bus(307);
		Subway subway4 = new Subway(4);
		
		no1.takeBus(bus307);
		no1.showInfo();
		bus307.showInfo();
		System.out.println();
		
		no2.takeSubway(subway4);
		no2.showInfo();
		subway4.showInfo();
	}
}