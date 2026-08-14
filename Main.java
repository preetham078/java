import java.util.Scanner;

class Person {
    String name;
    int age;

    void getPersonDetails(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();
    }
}

public class Main {
    static class Student extends Person {
        int marks;

        void getStudentDetails(Scanner sc) {
            System.out.print("Enter marks: ");
            marks = sc.nextInt();
            sc.nextLine();
        }

        void display() {
            System.out.println("\nStudent Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Marks: " + marks);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        s.getPersonDetails(sc);
        s.getStudentDetails(sc);
        s.display();

        sc.close();
    }
}