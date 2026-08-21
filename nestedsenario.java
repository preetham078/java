class employee
{
    void calculateSalary(double basic,double bonus)
    {
        
        class salary
        {
            void calculatetotal()
            {
                System.out.println("Total salary is "+(basic+bonus));
                System.out.println("Basic salary is "+basic);
                System.out.println("Bonus is "+bonus);
            }
        }
        salary s = new salary();
        s.calculatetotal();
        
    }
}
class nestedsenario
{
    public static void main(String args[])
    {
        employee e = new employee();
        e.calculateSalary(50000, 10000);
    }
}