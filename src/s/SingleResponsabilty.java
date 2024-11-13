package s;

public class SingleResponsabilty {


    // WRONG!
    // You shouldn't send email and validate email in the same method, you can call them in the same method, but you shouldn't implement them in the same method.

    /*
    static void sendEmail(String email, String subject, String message) {
        System.out.println("Validating email..." + email);
        System.out.println("Sending email... " + subject);
        System.out.println(subject);
        System.out.println(message);
    }
    */

    // CORRECT!
    // You should send email and validate email in different methods.
    static void sendEmail(String email, String subject, String message) {
        verifyEmail(email);
        System.out.println("Sending email... " + subject);
        System.out.println(subject);
        System.out.println(message);
    }

    static void verifyEmail(String email) {
        if (!email.contains("@")) throw new IllegalArgumentException("Invalid email");
        System.out.println("Validating email..." + email);
    }

    public static void main(String[] args) {
        sendEmail("contato@daroz.dev", "Learning SOLID", "SOLID is some principles that help us to write better code.");
    }
}
