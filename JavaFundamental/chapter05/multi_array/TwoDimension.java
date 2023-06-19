package multi_array;

public class TwoDimension {

	public static void main(String[] args) {
		char[][] alphabet = new char[2][13];
		char a = 'a';
		for(int i = 0; i < alphabet.length; i++) {
			for(int j = 0; j < alphabet[i].length; j++, a++) {
				alphabet[i][j] = a;
			}
		}
		
		for(int i = 0; i < alphabet[0].length; i++) {
			System.out.print(alphabet[0][i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < alphabet[0].length; i++) {
			System.out.print(alphabet[1][i]);
		}
	}
}