package array_list;
import java.util.ArrayList;

import array.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		// add() 메서드로 요소 값 추가
		library.add(new Book("종의 기원", "정유정"));
		library.add(new Book("개미", "베르나르"));
		library.add(new Book("보통의 존재", "이석원"));
		library.add(new Book("낭만적 연애와 그 후의 일상", "알랭"));
		library.add(new Book("살인자의 기억법", "김영하"));
		
		// 배열에 추가된 요소 갯수만큼 출혁
		for(int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		// 향상된 for문 사용
		for(Book book : library) {
			book.showBookInfo();
		}
	}
}