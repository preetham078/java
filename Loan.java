package bank.loan;

public class Loan {
    int loanNumber;
    String loanType;
    double loanAmount;

    public Loan(int loanNumber, String loanType, double loanAmount)
    {
        this.loanNumber = loanNumber;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
    }

    public void display()
    {
        System.out.println("Loan Number: " + loanNumber);
        System.out.println("Loan Type: " + loanType);
        System.out.println("Loan Amount: " + loanAmount);
    }
    
}
