package chapter14;

interface NumberFunc {
	int func(int n);
}

interface MyFunc<T> {
	T modify(T t);
}

public class Lambda1 {
	public static void main(String[] args) {

		// 람다식 블록
		NumberFunc sum = (n) -> {
			int result = 0;
			for (int i = 0; i <= n; i++) {
				result += i;
			}
			return result;
		};

		System.out.println("1 ~ 10까지의 합 = " + sum.func(10));
		System.out.println("1 ~ 100까지의 합 = " + sum.func(100));

		// 제네릭 함수형 인터페이스(리턴 타입 = 매개변수 타입)
		MyFunc<String> mf1 = (str) -> str.toUpperCase() + " : " + str.length();
		System.out.println(mf1.modify("iRu"));

		MyFunc<Integer> mf2 = (n) -> n * 2;
		System.out.println(mf2.modify(99));

	}
}
