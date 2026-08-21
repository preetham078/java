class outer 
{
    class inner
    {
        void display()
        {
            System.out.println("This is an inner class");
        }
    }
}
class nestedclass
{
    public static void main(String args[])
    {
        outer o=new outer();
        outer.inner i=o.new inner();
        i.display();
    }
}