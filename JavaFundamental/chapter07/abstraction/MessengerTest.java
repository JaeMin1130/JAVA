package chapter7.abstraction;

public class MessengerTest {

	public static void main(String[] args) {

		IPhoneMessenger iphone = new IPhoneMessenger();
		GalaxyMessenger galaxy = new GalaxyMessenger();
		
		// static 필드, 메서드
		System.out.println("메신저 최소 문자 크기 " + Messenger.MIN_SIZE);
		System.out.println("메신저 최대 문자 크기 " + Messenger.MAX_SIZE);
		Messenger.getConnection();

		iphone.setLogin(true);
		iphone.getMessage();
		iphone.setMessage("hello");
		iphone.clearMessage();

		galaxy.setLogin(true);
		galaxy.getMessage();
		galaxy.setMessage("hi");
		galaxy.changeKeyboard();
		
		// 다중상속
		galaxy.fileDownload();
		galaxy.fileUpload();
		
		// 복합상속
		iphone.fileUpload();
		iphone.fileDownload();
		iphone.draw_textBox();
		iphone.draw_submitButton();
	}
}