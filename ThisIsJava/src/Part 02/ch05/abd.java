import java.util.Scanner;

public class abd {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            int[] scores = new int[3];
            System.out.println((i+1) + "번째 학생의 점수를 입력하세요.");
            String str3 = scanner1.nextLine();
            scores[i] = Integer.parseInt(str3);
        }
        
    }
}