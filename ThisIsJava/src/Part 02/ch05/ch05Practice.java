import java.util.Arrays;
import java.util.Scanner;

public class ch05Practice {
    public static void main(String[] args) {
        /* 2번 문제
        int[][] array = {
            {95,98}, 
            {83, 92, 96}, 
            {78, 83, 93, 87, 88}
        };
        int sum = 0;
        int total = 0;
        for(int i = 0; i < array.length; i++) {
            total += array[i].length;
            for(int k = 0; k < array[i].length; k++) {
                sum += array[i][k];
            }
        }
        double avg = (double) sum / total;
        System.out.println("평균점수 : " + avg);  */
        
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("-------------------------------------------------------------");
            System.out.println("\n번호를 입력하세요.");

            int totalNum = 0;
            String str1 = scanner.nextLine();

            if(str1.equals("1")) {
                System.out.println("\n학생수를 입력하세요.");
                String str2 = scanner.nextLine();
                System.out.println("\n학생수 : " + str2 + "명"); 
                totalNum = Integer.parseInt(str2);                          
                }
            else if(str1.equals("5")) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }    
            int[] scores = new int[totalNum];

            System.out.println("\n번호를 입력하세요.");
            String str3 = scanner.nextLine();
    
            if(str3.equals("2")) {
                for(int i = 0; i < totalNum; i++) {
                    System.out.println((i+1) + "번째 학생의 점수를 입력하세요.");
                    String str4 = scanner.nextLine();
                    scores[i] = Integer.parseInt(str4);
                }        
            }
            else if(str3.equals("5")) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }    

            System.out.println("\n번호를 입력하세요.");
            String str5 = scanner.nextLine();
            
            if(str5.equals("3")) {
                for(int i = 0; i < totalNum; i++) {
                System.out.println((i+1) + "번 학생 : " + scores[i]);
                }
            }
            else if(str5.equals("5")) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }
            System.out.println("\n번호를 입력하세요.");
            String str6 = scanner.nextLine();
            if(str6.equals("4")) {
                int max = Arrays.stream(scores).max().getAsInt();
                int sum = 0;
                for(int i = 0; i < scores.length; i++) {
                    sum += scores[i];
                }
                double avg = (double) sum / totalNum;
                System.out.println("\n최고 점수 : " + max);
                System.out.println("평균 점수 : " + avg);
                }
            else if(str6.equals("5")) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }               
        }
    }
}