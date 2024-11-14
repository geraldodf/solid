package open_closed_principle;

public class Pix implements Payment {

    @Override
    public void process() {
        System.out.println("Pix is processing...");
    }

    @Override
    public boolean pay(double value) {
        System.out.println("Paying with Pix...");
        System.out.println("Value paid: " + value);
        return true;
    }

}
