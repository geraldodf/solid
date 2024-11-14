package dependency_inversion_principle;

// We have the same methods as Database interface, but we don't respect the Database contract. It won't work.
public class Mongo {

    public void save(Object object) {
        System.out.println("Saving object in MongoDB...");
    }

    public void delete(Object object) {
        System.out.println("Deleting object in MongoDB...");
    }
}
