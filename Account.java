package bank.accounts;

public class Account {
    int accountNumber;
    String accountType;
    double balance;

    public Account(int accountNumber, String accountType, double accountBalance)
    {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = accountBalance;
    }

    public void display()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + balance);
    }
    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }
    public void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
    public void displayBalance()
    {
        System.out.println("Account Balance: " + balance);
    }
}
