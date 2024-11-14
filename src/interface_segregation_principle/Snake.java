package interface_segregation_principle;

public class Snake implements Animal {

    @Override
    public void walk() {
        System.out.println("I can't walk, I'm a snake!");
        System.out.println("I'm just crawling...");
        throw new UnsupportedOperationException("I'm a snake!");
    }

    @Override
    public void swim() {
        System.out.println("Snake is swimming...");
    }

    @Override
    public void move() {
        System.out.println("Snake is moving...");
    }

    @Override
    public void eat() {
        System.out.println("Snake is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Snake is sleeping...");
    }
}
