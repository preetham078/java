class atm
{
    double balance;
    String name;
    String branch;
    double bal;

    atm(double balance,String name,String branch,double bal)
    {
        this.balance=balance;
        this.name=name;
        this.branch=branch;
        this.bal=bal;
    }
    atm(int balance,String name,String branch)
    {
        this.balance=balance;
        this.name=name;
        this.branch=branch;
        this.bal=balance;
    }
    {

    }

    double deposit(double amt)
    {
        bal=bal+amt;
        System.out.println("Balance after deposit: "+bal);
        return bal;
    }

    double withdraw(double amt)
    {
        if(amt<=bal)
        {
            bal=bal-amt;
            System.out.println("Balance after withdraw: "+bal);
            return bal;
        }
        else
        {
            System.out.println("Insufficient balance");
            return bal;
        }
    }

    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Branch: "+branch);
        System.out.println("Balance: "+bal);
    }
}

public class activity1
{
    public static void main(String args[])
    {
        atm a=new atm(101,"eran","SBI",5000);
        a.display();
        a.deposit(2000);
        a.withdraw(1000);

        atm b=new atm(102,"ram","canara",6000);
        b.display();
        b.deposit(3000);
        b.withdraw(2000);
    }
}