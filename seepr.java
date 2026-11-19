import java.util.*;

public class seepr {


    public static void main(String [] args)
    {
        List<String> sub =new ArrayList<>();
        sub.add("a");
        sub.add("b");
        sub.add("c");
        for(String s:sub)
        {
            System.out.println(s);
        }
        System.out.println(sub.get(0));
        System.out.println(sub.size());
        System.out.println(sub.contains("a"));
        // sub.clear();
        System.out.println(sub.isEmpty());
        System.out.println(sub.add("w"));
        System.out.println(sub.add("e"));
        System.out.println(sub);


    }
    
}
