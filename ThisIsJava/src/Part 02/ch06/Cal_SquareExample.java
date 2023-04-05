public class Cal_SquareExample {
    public static void main(String[] args) {
        Cal_Square square = new Cal_Square();

        double result1 = square.areaRectangle(6.7);
        System.out.printf("result1: %3.2f" , result1);

        double result2 = square.areaRectangle(6.7, 8);
        System.out.printf("\nresult2: %3.2f" , result2);


        
    }
    
}
