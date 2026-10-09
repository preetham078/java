import java.util.Hashtable;



public class hashtable {
    public static void main(String[] args) {
        Hashtable<String, String> student = new Hashtable<>();
        student.put("1", "A");
        student.put("2", "B");
        student.put("3", "C");

        int id=1;

        if(student.containsKey(String.valueOf(id))){
            System.out.println("Student found " + student.get(String.valueOf(id)));
        } else {
            System.out.println("Student with ID " + id + " does not exist.");
        }

       
    }
}
