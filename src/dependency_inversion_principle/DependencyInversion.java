package dependency_inversion_principle;

public class DependencyInversion {
    public static void main(String[] args) {

        // Using Postgres that implements Database interface
        GenericRepository genericRepository = new GenericRepository(new Postgres());
        genericRepository.save(new Object());
        genericRepository.delete(new Object());

        // Using MySQL that implements Database interface
        genericRepository = new GenericRepository(new MySQL());
        genericRepository.save(new Object());
        genericRepository.delete(new Object());

        // We cannot use Mongo! It doesn't implement Database interface.
        // genericRepository = new GenericRepository(new Mongo());
        // genericRepository.save(new Object());
        // genericRepository.delete(new Object());
    }
}
