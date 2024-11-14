package liskov_substitution_principle;

public class Ferrari extends Car {
    public Ferrari(String name, String model, int speed) {
        super(name, model, speed);
    }

    public void accelerate() {
        System.out.println("Accelerating my poweful Ferrari...");
    }
}
