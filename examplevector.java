import java.util.*;
public class examplevector {
    public static void main(String[] args)
    {
        Vector<Integer> marks =new Vector<>();
        marks.add(10);
        marks.add(20);
        marks.add(30);
        for(int mark : marks)
        {
            System.out.println(mark);
        }
        System.out.println(marks.size());
        System.out.println(marks.capacity());
    }
    
}
