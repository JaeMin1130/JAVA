public class OperationPromotion {
    public static void main(String[] args) {
        byte result1 = 10 + 20;                     // 컴파일 단계에서 연산
        System.out.println("result1 : " + result1);

        byte v1 = 10;       
        byte v2 = 20;
        int result2 = v1 + v2;                      // int 타입으로 선언해야 한다.
        System.out.println("result2 : " + result2);

        short v3 = 20;
        int v4 = 100;
        long v5 = 1000;
        long result3 = v3 + v4 + v5;                // long 타입이 포함돼 있으면 long 타입으로 선언한다.
        System.out.println("result3 : " + result3);
    
        char v6 = 'A';
        char v7 = 1;
        int result4 = v6 + v7;                      // int 타입으로 선언한다.
        System.out.println("result4 : " + result4);
        System.out.println("result4 : " + (char)result4);

        int v8 = 10;                                
        int result5 = v8 / 3;                       // 정수 부분만 나온다.
        System.out.println("result5 : " + result5); 

        int v9 = 10;            
        double result6 = v9 / 3.0;                  // 실수 값을 얻으려면 double 타입으로 선언해야 한다.
        System.out.println("result6 : " + result6);

        int v10 = 10;
        int v11 = 6;
        double result7 = (float)v10 / v11;          // 실수 타입으로 변환
        System.out.println("result7 : " + result7);
    }
}