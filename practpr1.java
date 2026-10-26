 class bank
{
    String name;
    long acnum;
    double bal;

    bank(String name,long acnum,double bal)
    {
        this.name=name;
        this.acnum=acnum;
        this.bal=bal;
    }
    void deposite(double amt)
    {
        bal=bal+amt;
        System.out.println(bal+" Af DEPO");
    }
    void withdraw(double amtt)
    {
        if (amtt>bal)
        {
            System.out.println("insufficient balance");

        }
        else
        {
            bal=bal-amtt;
            System.out.println(bal+" Af withdral");
        }
    }
}


public class practpr1 {
    public static void main(String [] args)
    {
        bank b1=new bank("eran",1010,50000);
        b1.deposite(12);
        b1.withdraw(122);
        b1.withdraw(50000);
    }
    
}
