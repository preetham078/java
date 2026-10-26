class BankAccount {
    String accountHolderName;
    int accountNumber;
    String accountType;
    double accountBalance;

    BankAccount(String name, int number, String type, double balance) {
        this.accountHolderName = name;
        this.accountNumber = number;
        this.accountType = type;
        this.accountBalance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > accountBalance) {
            System.out.println("Insufficient balance");
        } else {
            accountBalance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void balanceEnquiry() {
        System.out.println("Balance: " + accountBalance);
    }

    public static void main(String[] args) {
        BankAccount ac = new BankAccount("Ravi", 1001, "Savings", 10000);

        ac.balanceEnquiry();
        ac.deposit(5000);
        ac.withdraw(3000);
        ac.balanceEnquiry();
        ac.withdraw(50000);
        ac.deposit(0);
        ac.withdraw(0);
        ac.deposit(-500);
        ac.withdraw(0);

        BankAccount withdraw = new BankAccount("Ravi", 1002, "Savings", 5000);
        withdraw.withdraw(2000);

        BankAccount deposit = new BankAccount("Ravi", 1003, "Savings", 5000);
        deposit.deposit(2000);
    }
}
