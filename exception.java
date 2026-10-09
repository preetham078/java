public class exception {
    int a=10;
    int b=0;
    int c=a/b;
    void display()
    {
        System.out.println("Value of c: "+c);
    }

    public static void main(String args[])
    {
        exception e =new exception();
        e.display();
    }
    
}

