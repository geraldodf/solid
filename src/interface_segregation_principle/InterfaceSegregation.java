package interface_segregation_principle;

public class InterfaceSegregation {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal snake = new Snake();

        lion.move();

        // Trying to use a method that the class shouldn't need to implement
        snake.walk();
    }
}
