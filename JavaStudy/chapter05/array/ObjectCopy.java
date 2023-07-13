package array;

public class ObjectCopy {
	public static void main(String[] args) {
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		Book[] array3 = new Book[3];
		Book[] array4 = new Book[3];
		
		array1[0] = new Book("종의 기원", "정유정");
		array1[1] = new Book("개미", "베르나르");
		array1[2] = new Book("보통의 존재", "이석원");
		
		array3[0] = new Book("종의 기원", "정유정");
		array3[1] = new Book("개미", "베르나르");
		array3[2] = new Book("보통의 존재", "이석원");
		
		array4[0] = new Book();
		array4[1] = new Book();
		array4[2] = new Book();
		
		System.arraycopy(array1, 0, array2, 0, 3);  // 얕은 복사
		
		// 깊은복사
		for(int i = 0; i < array3.length; i++) {
			array4[i].setBookName(array3[i].getBookName());
			array4[i].setAuthor(array3[i].getAuthor());
		}
		
		array2[0].setAuthor("알랭");
		array2[0].setBookName("나는 왜 너를 사랑하는가");
		
		array3[0].setAuthor("알랭");
		array3[0].setBookName("나는 왜 너를 사랑하는가");
		
		for(int i = 0; i < array1.length; i++) {
			array1[i].showBookInfo();
		}
		for(int i = 0; i < array2.length; i++) {
			array2[i].showBookInfo();
		}
		
		for(int i = 0; i < array1.length; i++) {
			array3[i].showBookInfo();
		}
		for(int i = 0; i < array2.length; i++) {
			array4[i].showBookInfo();
		}
	}
}
