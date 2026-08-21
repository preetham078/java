class Outer
{
    void display()
    {
        final int x=10;
        class localinner
        {
            void show()
            {
                System.out.println("This is a local inner class");
                System.out.println("Value of x:"+x);
            }
        }
        localinner li = new localinner();
        li.show();
    }
}
class localclass
{
    public static void main(String args[])
    {
        Outer o=new Outer();
        o.display();
    }
}