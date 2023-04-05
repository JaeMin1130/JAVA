public class CalculatorExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        cal.powerOn();

        int result1 = cal.plus(3, 4);
        System.out.println("result1: " + result1);

        double result2 = cal.divide(4, 3);
        System.out.printf("result2: %3.3f", result2);

        cal.powerOff();
    }   
}
