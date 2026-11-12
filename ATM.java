import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class Account {

    String accountHolderName;
    double accountBalance;

    Account(String accountHolderName, double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > accountBalance) {

            throw new InsufficientBalanceException(
                "Insufficient balance! Withdrawal cannot be processed."
            );

        } else {

            accountBalance = accountBalance - amount;

            System.out.println("Withdrawal successful!");
            System.out.println("Withdrawn Amount: ₹" + amount);
            System.out.println("Remaining Balance: ₹" + accountBalance);
        }
    }
}

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account account = new Account("Preetham", 10000);

        System.out.print("Enter withdrawal amount: ₹");
        double amount = sc.nextDouble();

        try {

            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {

            System.out.println("Transaction failed!");
            System.out.println(e.getMessage());

            System.out.println(
                "Available Balance: ₹" + account.accountBalance
            );
        }

        sc.close();
    }
}