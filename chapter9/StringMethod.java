package chapter9;

public class StringMethod {

	public static void main(String[] args) {

//		equals() : 문자열이 같은지를 비교 / equalsIgnoreCase() : 대소문자 구분 X

		String s1 = new String("JAVA");
		String s2 = "java";
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equalsIgnoreCase(s2)); // true

//		toString() : 문자열을 반환

		System.out.println(s1); // JAVA

//		length() : 문자열의 전체 길이 반환 / charAt() : 인자값으로 전달받은 인덱스의 문자 반환

		System.out.println(s1.length()); // 4
		System.out.println(s1.charAt(2)); // V

//		trim() : 문자열 양끝에 있는 공백 제거 / isEmpty() : 문자열의 길이가 0인지 판단

		String s3 = "  Iru ";
		String s3_1 = s3.trim();
		System.out.println(s3_1);
		System.out.println(s3.isEmpty()); // false

//		indexOf() : 인자로 지정된 문자열이 시작되는 인덱스를 반환(처음부터 검색) / lastIndexOf() : 끝에서부터 검색

		String s4 = "Iru is very cute.";
		System.out.println(s4.indexOf("ic")); // -1
		System.out.println(s4.indexOf("Iru")); // 0
		System.out.println(s4.indexOf(" ")); // 3
		System.out.println(s4.indexOf("e")); // 8
		System.out.println(s4.lastIndexOf("e")); // 15

//		startsWith() : 인자로 전달받은 문자열로 시작하는지 판단 / endsWith() : 끝나는지 판단

		System.out.println(s4.startsWith("Iru")); // true
		System.out.println(s4.startsWith("ru")); // false
		System.out.println(s4.endsWith("cute.")); // true
		System.out.println(s4.endsWith("cute")); // false

//		concat() : 문자열 추가 / replace(), replaceAll(), replaceFirst() : 문자열 변경

		String s5 = "Iru";
		String s5_1 = s5.concat(" is"); // Iru is
		String s5_2 = s5_1.replace("s", "s cute."); // Iru is cute.
		String s5_3 = s5_2.replaceAll("u", "on"); // Iron is conte.
		String s5_4 = s5_2.replaceFirst("u", "on"); // Iron is cute.

//		toLowerCase() : 대문자 -> 소문자 / toUpperCase() : 소문자 -> 대문자

		String s6 = "Cat Iru";
		String s6_1 = s6.toLowerCase(); // cat iru
		String s6_2 = s6.toUpperCase(); // CAT IRU

//		split() : 인자로 구분자를 지정하면 문자열을 자른 후, String[] 배열로 반환

		String s7 = "Iru is cute.";
		String[] s7_1 = s7.split(" "); // {Iru, is, cute.}
		String[] s7_2 = s7.split(" ", 2); // {Iru, is cute.}

//		substring() : 인자값으로 전달받은 인덱스부터 해당되는 문자열 추출

		String s7_3 = s7.substring(2); // u is cute.
		String s7_4 = s7.substring(7, 11); // cute

//		valueOf() : 데이터 타입을 String으로 변환

		String s8 = String.valueOf(123); // "123"
	}

}
