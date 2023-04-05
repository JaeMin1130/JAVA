package singleton;

public class CompanyTest {
	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		System.out.println(myCompany1 == myCompany2);
		System.out.println(myCompany1.name);
		System.out.println(myCompany2.name);
	}
}