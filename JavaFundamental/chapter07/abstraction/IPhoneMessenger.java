package chapter7.abstraction;

public class IPhoneMessenger extends GraphicIOS implements Messenger, WorkFile {

	@Override
	public String getMessage() {
		return "iPhone";
	}

	@Override
	public void setMessage(String msg) {
		System.out.println("iPhone에서 메시지를 설정합니다 : " + msg);

	}

	public void clearMessage() {
		System.out.println("좌우로 흔들어 문자열을 지웁니다.");
	}
	
	public void draw_textBox() {
		super.draw_textBox();
		System.out.println("IPhone: 텍스트 상자를 그린다.");
	}
	
	public void draw_submitButton() {
		super.draw_submitButton();
		System.out.println("IPhone: 전송 버튼을 그린다.");
	}

	@Override
	public void fileUpload() {
		System.out.println("file을 다운로드합니다.");
	}

	@Override
	public void fileDownload() {
		System.out.println("file을 업로드합니다.");
	}

}
