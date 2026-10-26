class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public BankAccount(int accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    public synchronized void deposit(String userName, double amount) {
        accountBalance += amount;

        System.out.println(userName + " deposited: ₹" + amount);
        System.out.println("Updated Balance: ₹" + accountBalance);
    }

    public synchronized void withdraw(String userName, double amount) {
        if (accountBalance >= amount) {
            accountBalance -= amount;

            System.out.println(userName + " withdrew: ₹" + amount);
            System.out.println("Updated Balance: ₹" + accountBalance);
        } else {
            System.out.println(userName + " tried to withdraw ₹" + amount);
            System.out.println("Insufficient Balance");
        }
    }

    public synchronized void displayBalance() {
        System.out.println("Current Account Balance: ₹" + accountBalance);
    }
}

class Bankinguser extends Thread {
    private String userName;
    private BankAccount account;
    private String transactionType;
    private double amount;

    public Bankinguser(String userName, BankAccount account,
                        String transactionType, double amount) {
        this.userName = userName;
        this.account = account;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public void run() {
        if (transactionType.equalsIgnoreCase("Deposit")) {
            account.deposit(userName, amount);
        } else if (transactionType.equalsIgnoreCase("Withdrawal")) {
            account.withdraw(userName, amount);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount account =
            new BankAccount(1001, "Rahul", 10000);

        Bankinguser t1 =
            new Bankinguser("Rahul", account, "Deposit", 3000);

        Bankinguser t2 =
            new Bankinguser("Priya", account, "Withdrawal", 2000);

        Bankinguser t3 =
            new Bankinguser("Arjun", account, "Deposit", 1500);

        Bankinguser t4 =
            new Bankinguser("Sneha", account, "Withdrawal", 12000);

        try {
            t1.start();
            t2.start();
            t3.start();
            t4.start();

            t1.join();
            t2.join();
            t3.join();
            t4.join();

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println();
        System.out.println("All transactions completed.");
        account.displayBalance();
    }
}
