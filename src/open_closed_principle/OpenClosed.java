package open_closed_principle;

public class OpenClosed {
    public static void main(String[] args) {

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        Card card = new Card();
        Pix pix = new Pix();

        System.out.println(paymentProcessor.processPayment(card, 29.99));
        System.out.println(paymentProcessor.processPayment(pix, 19.99));

    }
}
