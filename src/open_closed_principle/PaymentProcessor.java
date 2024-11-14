package open_closed_principle;

public class PaymentProcessor {

    // WRONG!
    // You shouldn't use if to check every payment. You will need a lot of ifs and it's not scalable. What about the next payment? And the next one? And the next one?
    /*
    public boolean processPayment(Card card, Pix pix) {
        System.out.println("Processing payment...");

        if (pix != null) {
            System.out.println("processing pix...");
            return true;
        }

        if (card != null) {
            System.out.println("processing card...");
            return true;
        }

       throw new IllegalArgumentException("Invalid payment");
    }
    */


    // instead of ifs, you can use Polymorphism using the Payment interface. Now we accept any payment that implements the Payment interface. Like MAGIC! 🧙‍♂️
    public boolean processPayment(Payment payment, double value) {
        System.out.println("Starting payment...");
        payment.process();
        return payment.pay(value);
    }
}
