package liskov_substitution_principle;

public class Ford extends Car {
    public Ford(String name, String model, int speed) {
        super(name, model, speed);
    }

    public void accelerate() {
        System.out.println("Accelerating my humble Ford...");
    }
}
