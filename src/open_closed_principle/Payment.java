package open_closed_principle;

public interface Payment {
    void process();
    boolean pay(double value);
}
