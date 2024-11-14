package dependency_inversion_principle;

public class GenericRepository {

    private Database database;

    // Injecting database dependency
    public GenericRepository(Database database) {
        this.database = database;
    }

    public void save(Object object) {
        database.save(object);
    }

    public void delete(Object object) {
        database.delete(object);
    }
}
