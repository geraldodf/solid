package interface_segregation_principle;

public interface Animal {

    // WRONG!
    // Does every animal know how to walk? No! The snake crawls, the lion the fish swims, etc.
    void walk();
    // WRONG!
    // Does every animal know how to swim? IDK, I'm not a biologist, but I don't think so.
    void swim();

    // CORRECT!
    void move();
    void eat();
    void sleep();
}
