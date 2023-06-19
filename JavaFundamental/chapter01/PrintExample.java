public class PrintExample {
    public static void main(String[] args){
        int value = 1000;
        System.out.printf("원주율 : %2$3.2f, 오다리 가격 : %1$06d", value, 3140 / (double)value);

        double area = 3.141592 * 10 * 10;
        System.out.printf("\n반지름이 %d인 원의 넓이 : %7.4f", 10, area);
    }
}
