import java.util.*;
public class examplestack {
    public static void main(String [] args)
    {
        Deque<String> stacks = new ArrayDeque<>();
        stacks.push("first");
        stacks.push("second");
        stacks.push("Third");
        System.out.print(stacks.peek());
        System.out.println(stacks.pop());
        System.out.println(stacks);
    }
    
}
