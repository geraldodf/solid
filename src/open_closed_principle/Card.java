package open_closed_principle;

public class Card implements Payment {

    @Override
    public void process() {
        System.out.println("Card is processing...");
    }

    @Override
    public boolean pay(double value) {
        System.out.println("Paying with card...");
        System.out.println("Value paid: " + value);
        return true;
    }
}
