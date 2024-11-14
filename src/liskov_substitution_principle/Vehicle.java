package liskov_substitution_principle;

// Here we may have a Vehicle class, but we couldn't use it to have doors. Why? Not all vehicles have doors.
// If we want to have doors in hierarchy we should use a more specific class, like a Car.
public class Vehicle {
        int doors;
        String name;
        String model;
        int speed;
}
