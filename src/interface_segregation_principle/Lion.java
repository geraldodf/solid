package interface_segregation_principle;

public class Lion implements Animal {
    @Override
    public void walk() {
        System.out.println("Lion is walking...");
    }

    @Override
    public void swim() {
        System.out.println("Lion is swimming...");
    }

    @Override
    public void move() {
        System.out.println("Lion is moving...");
    }

    @Override
    public void eat() {
        System.out.println("Lion is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Lion is sleeping...");
    }

}
