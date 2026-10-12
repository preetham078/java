interface greeting
{
    void sayhello(String name);
}



public  class lambda_interface_with_functionalinterface {
    public static void main(String [] args)
    {
        greeting g = name -> System.out.println("hello,"+name);
        g.sayhello("eran");
    }

}

