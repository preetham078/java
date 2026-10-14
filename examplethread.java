class Mythread extends Thread
{
    public void run()
    {
        System.out.println("Thread is running");
    }
}





public class examplethread {
    public static void main(String [] args)
    {
        Mythread n=new Mythread();
        n.start();
    }
}
