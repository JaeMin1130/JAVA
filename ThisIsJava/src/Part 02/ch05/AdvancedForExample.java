public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = {66, 77, 88, 99, 44};

        int sum = 0;
        for(int score : scores){
            sum += score;
        }
        System.out.println("점수 총합 = " + sum);
    }
}