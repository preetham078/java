class Payment {

    void makePayment(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount");
        } else {
            System.out.println("Payment processed: Rs." + amount);
        }
    }

    void makePayment(double amount, String transactionId) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount");
            return;
        }

        if (transactionId == null || transactionId.trim().isEmpty()) {
            System.out.println("Invalid Transaction ID");
            return;
        }

        if (!transactionId.startsWith("TXN")) {
            System.out.println("Invalid Transaction ID format");
            return;
        }

        System.out.println("Payment Amount = Rs." + amount);
        System.out.println("Transaction ID = " + transactionId);
        System.out.println("Payment Successful");
    }
}

class CreditCardPayment extends Payment {

    @Override
    void makePayment(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount");
        } else {
            System.out.println("Credit Card Payment");
            System.out.println("Amount = Rs." + amount);
            System.out.println("Payment Successful");
        }
    }
}

class UPIPayment extends Payment {

    @Override
    void makePayment(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount");
        } else {
            System.out.println("UPI Payment");
            System.out.println("Amount = Rs." + amount);
            System.out.println("Payment Successful");
        }
    }
}

class NetBankingPayment extends Payment {

    @Override
    void makePayment(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount");
        } else {
            System.out.println("Net Banking Payment");
            System.out.println("Amount = Rs." + amount);
            System.out.println("Payment Successful");
        }
    }
}

public class Practicum4 {

    public static void main(String[] args) {

        Payment payment;

        payment = new CreditCardPayment();
        payment.makePayment(5000.00);
        System.out.println();

        payment = new UPIPayment();
        payment.makePayment(1200.50);
        System.out.println();

        payment = new NetBankingPayment();
        payment.makePayment(8500.00);
        System.out.println();

        payment = new CreditCardPayment();
        payment.makePayment(2500.00, "TXN1001");
        System.out.println();

        payment = new CreditCardPayment();
        payment.makePayment(1000.00);

        payment = new UPIPayment();
        payment.makePayment(1000.00);

        payment = new NetBankingPayment();
        payment.makePayment(1000.00);
        System.out.println();

        payment = new CreditCardPayment();
        payment.makePayment(-1000.00);
        System.out.println();

        payment = new UPIPayment();
        payment.makePayment(0.00);
        System.out.println();

        payment = new CreditCardPayment();
        payment.makePayment(3000.00, "");

        payment = null;

        try {
            payment.makePayment(1000.00);
        } catch (NullPointerException e) {
            System.out.println("Payment object is null");
        }

        System.out.println();

        payment = new CreditCardPayment();
        payment.makePayment(4500.00, "123");
    }
}
