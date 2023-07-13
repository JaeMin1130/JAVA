package chapter14;

interface StringFunc {
	String modify(String s);
}

public class Lambda2 {
	static String test(StringFunc sf, String s) {
		return sf.modify(s);
	}

	public static void main(String[] args) {
		String str = "Korea, Australia, China, Germany, Spain, Turkey";

		StringFunc sf1 = (s) -> {
			String result = "";
			char c;
			for (int i = 0; i < s.length(); i++) {
				c = s.charAt(i);
				if (c == ',') {
					result += " ";
				} else
					result += c;
			}
			return result;
		};

		String s1 = test(sf1, str);
		System.out.println(s1);
		System.out.println(sf1.modify(str));
		
		// 람다식을 메서드의 인자로 바로 넣기
		String s2 = test((s) -> {
			int max = 0;
			int index = 0;
			String[] word = s.split(",");
			for (int i = 0; i < word.length; i++) {
				if (max < word[i].length()) {
					max = word[i].length();
					index = i;
				}
			}
			return word[index];
		}, str);
		System.out.println(s2);
	}
}