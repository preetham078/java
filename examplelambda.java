import java.util.ArrayList;
import java.util.Collections;

public class lamda {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("aaaaa");
        student.add("zzzzz");
        student.add("bbbbbb");
        student.add("ffff");

        Collections.sort(student);

        student.forEach(stu -> System.out.println(stu));
    }
}
