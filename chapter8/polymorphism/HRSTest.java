package chapter8.polymorphism;

public class HRSTest {
	public static void calcTax(Employee e) {
		System.out.println("소득세를 계산합니다.");
	}

	public static void main(String[] args) {
//		Employee e = new Employee();
//		Salesman s = new Salesman();
//		Consultant c = new Consultant();
//		Manager m = new Manager();
//		Director d = new Director();
//		calcTax(s);
//		calcTax(c);
//		calcTax(d);
//
//		// toString(): '클래스이름@인스턴스ID' 값을 반환한다.
//		System.out.println(c.toString());
//		System.out.println(d.toString());
//		System.out.println("s: " + s.toString());
//		
//		Salesman s2 = new Salesman();
//		System.out.println("s2: " + s2.toString());
//		s2 = s;
//		System.out.println("s2: " + s2.toString());
		
//		// equals(): 같은 인스턴스를 참조하는지 판단한다.
//		if (s.equals(s2)) {
//			System.out.println("동일한 객체입니다.");
//		} else {
//			System.out.println("서로 다른 객체입니다.");
//		}
		
		Salesman s1 = new Salesman();
		Employee s2 = new Salesman();
		Object s3 = new Salesman();
		
		Object m1 = new Manager();
		Employee m2 = new Manager();
		Manager m3 = new Manager();
//		Director m4 = new Manager();    오류 발생
		
		Object arr[] = new Object[6];
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = m1;
		arr[4] = m2;
		arr[5] = m3;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

//		st1, st2는 주솟값이 다르다.(new로 생성)		
		String st1 = new String("ab");
		String st2 = new String("ab");
		
//		st3, st4는 주솟값이 같다.(리터럴로 생성)
		String st3 = "ab";
		String st4 = "ab";
		
//		'==' 주솟값을 비교
		System.out.println(st3 == st4);
		System.out.println(st1 == st2);
		
//		equals 저장된 값을 비교
		System.out.println(st3.equals(st2));
		System.out.println(st1.equals(st2));
	}
	
	

}
