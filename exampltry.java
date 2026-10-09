// public class exampltry {
    
//     public static void main(String [] args)
//     {
//         try {
//         int a=0;
//         int b=10;
//         int c=b/a;
//         System.out.println("The result is: "+c);

//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println("Error: Division by zero is not allowed.");
//         }
//     }
//

public class exampltry{
    public static void main(String [] args)
    {
        try{int a=0;
            int b=10;
            int c=b/a;
            System.out.println(c);
            int arr[]={10,20,30};
            System.out.println(arr[5]);
            

        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("errorarray");

        }
        catch(ArithmeticException e)
        {
            System.out.println("error");
        }
        catch(Exception e)
        {
            System.out.println("error");
        }
        finally{
        System.out.println("rest of the code");
}
    }
}
// A single try block can have multiple possible exceptions,
//  but only the catch corresponding to the first exception that occurs will execute.