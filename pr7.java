import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class Account {
    private String accountHolderName;
    private double accountBalance;

    public Account(String accountHolderName, double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Available Balance: " + accountBalance);
    }

    public void withdraw(double withdrawalAmount)
            throws InsufficientBalanceException {

        if (withdrawalAmount < 0) {
            System.out.println("Error: Withdrawal amount cannot be negative.");
            return;
        }

        if (withdrawalAmount == 0) {
            System.out.println("Error: Withdrawal amount cannot be zero.");
            return;
        }

        if (withdrawalAmount > accountBalance) {
            throw new InsufficientBalanceException(
                "Insufficient funds. Available balance is " + accountBalance
            );
        }

        accountBalance = accountBalance - withdrawalAmount;

        System.out.println("Withdrawal successful.");
        System.out.println("Amount withdrawn: " + withdrawalAmount);
        System.out.println("Remaining balance: " + accountBalance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account("Rahul", 15000);

        System.out.println("ATM WITHDRAWAL MACHINE");

        try {
            while (true) {
                System.out.println();
                acc.displayAccountDetails();

                System.out.print("Enter withdrawal amount (0 to exit): ");
                double withdrawalAmount = sc.nextDouble();

                if (withdrawalAmount == 0) {
                    System.out.println("Transaction ended.");
                    break;
                }

                try {
                    acc.withdraw(withdrawalAmount);
                } catch (InsufficientBalanceException e) {
                    System.out.println("Transaction failed: " + e.getMessage());
                }
            }
        } catch (InputMismatchException e) {
            System.out.println(
                "Invalid input. Please enter a numeric withdrawal amount."
            );
        } finally {
            System.out.println();
            System.out.println("Thank you for using the ATM.");
            sc.close();
        }
    }
}
