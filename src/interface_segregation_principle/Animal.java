package interface_segregation_principle;

public interface Animal {

    // WRONG!
    // Does every animal know how to walk? No! The snake crawls, the lion the fish swims, etc.
    void walk();

    // WRONG!
    // Does every animal know how to swim? IDK, but I don't think so.
    void swim();

    // CORRECT!
    // The correct way to implement this interface is to have a method that every animal needs to implement.
    void move();
    void eat();
    void sleep();
}
