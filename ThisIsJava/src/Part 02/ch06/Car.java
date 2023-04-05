public class Car {
    
    // 필드 선언
    String company = "현대자동차";
    String model, color;
    int maxSpeed;

    // 생성자 1
    Car(String model) {
        this(model, "은색", 250);
    }

    // 생성자 2
    Car(String model, String color) {
        this(model, color, 250);
    }

    // 생성자 3
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}