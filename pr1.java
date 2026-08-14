class bank
{
    String acname;
    long acnum;
    String type;
    double bal;
    
    bank(String acname,long acnum,String type,double bal)
    {
        this.acname=acname;
        this.acnum=acnum;
        this.type=type;
        this.bal=bal;
    }
    void deposite(double amt)
    {
        this.bal=this.bal+amt;
        System.out.println(" Af DEPO Balance. "+bal);
    }
    void withdraw(double amtt)
    {   if (this.bal>=amtt)
     {
        this.bal=bal-amtt;
        System.out.println("AF withdral Balance. "+bal);
     } else
     {
        System.out.println("insuf Balance");
    }
        
    }
    void balenqu()
    {
        System.out.println("Balance  "+bal);
    }
}
public class pr1
{
    public static void main(String[] args)
    {
        bank b1=new bank("eran",1010,"saving",50000);
        b1.deposite(12);
        b1.withdraw(122);
        b1.withdraw(50000);
        b1.balenqu();
       
    }
}
