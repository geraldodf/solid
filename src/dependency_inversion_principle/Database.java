package dependency_inversion_principle;

public interface Database {
    void save(Object object);
    void delete(Object object);
}
