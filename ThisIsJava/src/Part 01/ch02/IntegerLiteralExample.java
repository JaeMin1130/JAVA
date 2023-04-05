// 다양한 정수 리터럴 int 타입 변수에 대입하기

public class IntegerLiteralExample {
    public static void main(String[] args){
        int var1 = 0b1011;    // 2진수
        int var2 = 0107;      // 8진수
        int var3 = 315;       // 10진수
        int var4 = 0x2BF;     // 16진수

        long var5 = 123456789123L;  // 뒤에 'L'을 붙여 long 타입 값임을 컴파일러에게 알려줘야 한다.
    
        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);
        System.out.println("var5 : " + var5);
    }
}