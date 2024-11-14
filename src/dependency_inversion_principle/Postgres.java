package dependency_inversion_principle;

// Respecting the Database contract
public class Postgres implements Database {

    @Override
    public void save(Object object) {
        System.out.println("Saving object in Postgres...");
    }

    @Override
    public void delete(Object object) {
        System.out.println("Deleting object in Postgres...");
    }
}
