package dependency_inversion_principle;

public class MySQL implements Database {

    @Override
    public void save(Object object) {
        System.out.println("Saving object in MySQL...");
    }

    @Override
    public void delete(Object object) {
        System.out.println("Deleting object in MySQL...");
    }
}