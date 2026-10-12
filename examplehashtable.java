import java.util.*;

public class examplehashtable {
    public static void main(String [] args)
    {
        Hashtable <Integer,String> stu =new Hashtable<>();
        stu.put(101,"eran");
        stu.put(102,"mikasa");
        stu.put(103,"ervin");
        
        System.out.println(stu.get(102));
        System.out.println(stu.get(103));
        System.out.println("removed"+stu.remove(103));
        System.out.println(stu);
        System.out.println(stu.containsKey(101));
        System.out.println(stu.containsKey(109));
    }
    
}
