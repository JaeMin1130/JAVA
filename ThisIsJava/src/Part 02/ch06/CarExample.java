public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car("자가용");  // 생성자 1
        System.out.println("car1.company : " + car1.company);
        System.out.println("car1.model : " + car1.model);
        System.out.println();

        Car car2 = new Car("자가용", "빨강");  // 생성자 2
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println("car2.color : " + car2.color);
        System.out.println("car2.maxSpeed : " + car2.maxSpeed);
        System.out.println();

        Car car3 = new Car("자가용", "빨강", 200);  // 생성자 3
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println("car3.maxSpeed : " + car3.maxSpeed);
        System.out.println();
    }    
}
