package array;

public class Book {
	// 멤버 변수
	private String bookName, author;
	
	// 생성자
	public Book() {}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	// 메서드
	public String getBookName() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}
}