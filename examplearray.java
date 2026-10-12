import java.util.*;


public class examplearray {
    public static void main(String [] args)
    {
        List<String> subject = new ArrayList<>();
        subject.add("java");
        subject.add("python");
        subject.add("java");
        System.out.println(subject);
        subject.set(1,"c++");
        subject.remove("python");
        System.out.println(subject.get(0));
        System.out.println(subject.size());
        System.out.println(subject);

    }
    
}
