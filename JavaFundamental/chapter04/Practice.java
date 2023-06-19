import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

         /* 1번 문제  
        String grade = "B";
        int score1 = switch(grade) {
            case "A" -> 100;
            case "B" -> {int result = 100 - 20;
                         yield result;}        
            default -> 60;    
            }; 
        */

        /* 2번 문제     
        int sum = 0;
        for(int i = 1; i<=33; i++) {
            sum += (3 * i);
        }
        System.out.println(sum);
        */

        /* 3번 문제 
        while(true) {
            int value1 = (int)(Math.random() * 6) + 1;
            int value2 = (int)(Math.random() * 6) + 1;
            
            if(value1 + value2 != 5) {
                System.out.println("(" + value1 + ", " + value2 + ")");
                continue;
            }
            else {
                System.out.println("(" + value1 + ", " + value2 + ") 프로그램을 종료합니다.");
                break;      
            }         
        }
        */

        /* 4번 문제
        for(int x = 1; x <= 10; x++) {
            for(int y = 1; y <= 10; y++) {
                if(4*x + 5*y == 60) {
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }
        */
        
        /* 5번 문제
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        int in = 0;
        int out = 0;

        while(true) {
            System.out.println("\n-------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
            System.out.println("-------------------------------------");
            System.out.println("이용하실 서비스 번호를 입력해주세요.");
            String strNum1 = scanner1.nextLine();

            if(strNum1.equals("1")) {
                System.out.println("예금하실 금액을 입력해주세요.");
                String strNum2 = scanner2.nextLine();
                System.out.println("예금액 > " + strNum2 + "원");
                in += Integer.parseInt(strNum2);}

            else if(strNum1.equals("2")) {
                System.out.println("\n출금하실 금액을 입력해주세요.");
                String strNum3 = scanner3.nextLine();
                System.out.println("\n출금액 > " + strNum3 + "원");
                out += Integer.parseInt(strNum3);}
            
            else if(strNum1.equals("3")) {
                System.out.println("\n잔고 > " + (in - out) + "원");}

            else if(strNum1.equals("4")) {
                System.out.println("이용해 주셔서 감사합니다.");
                break;}               
        }
        */
    }    
}