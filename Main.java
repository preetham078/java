package bank;
import bank.accounts.Account;
import bank.customer.Customer;
import bank.loan.Loan;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "John Doe", 1234567890.0);
        Account account = new Account(101, "Savings", 1000.0);
        Loan loan = new Loan(1001, "Home", 50000.0);

        customer.display();
        account.display();
        loan.display();
        account.deposit(500.0);
        account.withdraw(200.0);
        account.displayBalance();
    }
}
