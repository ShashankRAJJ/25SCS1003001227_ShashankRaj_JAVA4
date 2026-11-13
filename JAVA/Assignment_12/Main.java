class Payment {
    void makePayment() {
        System.out.println("Making a payment...");
    }
}
class CreditCardPayment extends Payment {
    void makePayment() {
        System.out.println("Payment made using Credit Card.");
    }
}
class UPIPayment extends Payment {
    void makePayment() {
        System.out.println("Payment made using UPI.");
    }
}
class CashPayment extends Payment {
    void makePayment() {
        System.out.println("Payment made using Cash.");
    }
}
public class Main {
    public static void main(String[] args) {
        Payment p;
        p = new CreditCardPayment();
        p.makePayment();
        p = new UPIPayment();
        p.makePayment();
        p = new CashPayment();
        p.makePayment();
    }
}

