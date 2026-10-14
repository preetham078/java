class task extends Thread
{   public String t;
    task(String t)
    {
        this.t=t;
    }
    public void run()
    {
       for(int i=0;i<5;i++)
        {
            System.out.println("task"+t+" "+i);
        } 
    }
}




public class examplemultithread {
    public static void main(String args[])
    {
        task t1=new task("one ");
        task t2=new task("two ");
        t1.start();
        t2.start();
    }
    
}
