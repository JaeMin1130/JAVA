package array;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];  // Book 클래스형 객체 배열 생성

		library[0] = new Book("종의 기원", "정유정");
		library[1] = new Book("개미", "베르나르");
		library[2] = new Book("보통의 존재", "이석원");
		library[3] = new Book("낭만적 연애와 그 후의 일상", "알랭");
		library[4] = new Book("살인자의 기억법", "김영하");
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}
} 