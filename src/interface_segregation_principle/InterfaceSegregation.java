package interface_segregation_principle;

public class InterfaceSegregation {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal snake = new Snake();

        lion.move();
        snake.walk();
    }
}
