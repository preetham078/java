package bank.customer;

public class Customer 
{
    int customerId;
    String customerName;
    double contactNumber;

    public Customer(int customerId, String customerName, double contactNumber)
    {
        this.customerId = customerId;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
    }

    public void display()
    {
        System.out.println("Customer Id: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Contact Number: " + contactNumber);
    }
}