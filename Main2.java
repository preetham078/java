import java.util.Scanner;

class Employee{
    String name;
    int age;
    
    void getEmployeeDetails(Scanner sc) {
        System.out.print("Enter name: ");
        name=sc.next();
        
        System.out.println("Enter age: ");
        age=sc.nextInt();
        sc.nextLine();
    }
}

class Salary extends Employee {
    int salary;
    
    void getSalaryDetails(Scanner sc) {
        System.out.print("Enter salary: ");
        salary=sc.nextInt();
    }
    
    
    void display(){
        System.out.println("\nEmployee Details: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        
    }
}

public class Main2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Salary s = new Salary();
        
        s.getEmployeeDetails(sc);
        s.getSalaryDetails(sc);
        
        s.display();
        sc.close();
        
    }
}