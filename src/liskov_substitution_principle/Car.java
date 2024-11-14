package liskov_substitution_principle;

public class Car {

    String name;
    String model;
    int speed;

    public Car(String name, String model, int speed) {
        this.name = name;
        this.model = model;
        this.speed = speed;
    }

    public void accelerate() {
        System.out.println("Driving...");
    }

    public void brake() {
        System.out.println("Stopping...");
    }


}
