// public class examplenestedtry{
//     public static void main(String [] args)
//     {
//         try{
//             System.out.println("outer exception");
//             try{
//                 int a=10;
//                 int b=0;
//                 int c=a/b;
//                 System.out.println(c);
//             }
//             catch(ArithmeticException e)
//             {
//                 System.out.println("error inner");

//             }
           
//         }
//         catch(Exception e)
//         {
//             System.out.println("error outer");

//         }
//     }
// }

public class examplenestedtry{
    public static void main(String [] args)
    {
        try{
            System.out.println("outer exception");
            try{
                int a=10;
                int b=0;
                int c=a/b;
                System.out.println(c);
            }
            catch(ArithmeticException e)
            {
                System.out.println("error inner");

            }
            System.out.print(10/0);
        }
        catch(Exception e)
        {
            System.out.println("error outer");

        }
    }
}