package liskov_substitution_principle;

public class LiskovSubstitution {
    public static void main(String[] args) {
        Car ford = new Ford("Ford", "Mustang", 100);
        Car ferrari = new Ferrari("Ferrari", "F40", 100);

        ford.accelerate();
        ferrari.accelerate();

        ford.brake();
        ferrari.brake();

        ford = ferrari;

        ford.accelerate();
    }
}