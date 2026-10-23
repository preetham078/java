import java.util.*;

class Employee {
    int id;
    String name, designation, department, joiningDate, reportingOfficer;
    double salary;

    Employee(int id, String name, String designation, String department,
             double salary, String joiningDate, String reportingOfficer) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.department = department;
        this.salary = salary;
        this.joiningDate = joiningDate;
        this.reportingOfficer = reportingOfficer;
    }

    void display() {
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Joining Date: " + joiningDate);
        System.out.println("Reporting Officer: " + reportingOfficer);
    }
}

public class microproject {
    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addEmployee() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Designation: ");
        String designation = sc.next();

        System.out.print("Enter Department: ");
        String department = sc.next();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Joining Date: ");
        String date = sc.next();

        System.out.print("Enter Reporting Officer: ");
        String officer = sc.next();

        employees.add(new Employee(id, name, designation, department,
                salary, date, officer));

        System.out.println("Employee added successfully!");
    }

    static void displayEmployees() {
        for (Employee e : employees)
            e.display();
    }

    static void searchEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for (Employee e : employees) {
            if (e.id == id) {
                e.display();
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    static void updateEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for (Employee e : employees) {
            if (e.id == id) {
                System.out.print("Enter new salary: ");
                e.salary = sc.nextDouble();

                System.out.print("Enter new designation: ");
                e.designation = sc.next();

                System.out.println("Employee updated successfully!");
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    static void reportingEmployees() {
        System.out.print("Enter Reporting Officer: ");
        String officer = sc.next();

        System.out.println("Employees under " + officer + ":");

        for (Employee e : employees) {
            if (e.reportingOfficer.equalsIgnoreCase(officer))
                System.out.println(e.id + " - " + e.name);
        }
    }

    static void departmentReport() {
        System.out.print("Enter Department: ");
        String dept = sc.next();

        System.out.println("\nEmployees in " + dept + " department:");

        for (Employee e : employees) {
            if (e.department.equalsIgnoreCase(dept))
                e.display();
        }
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Employee Records Management ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Reporting Employees");
            System.out.println("6. Department Report");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    searchEmployee();
                    break;
                case 4:
                    updateEmployee();
                    break;
                case 5:
                    reportingEmployees();
                    break;
                case 6:
                    departmentReport();
                    break;
                case 7:
                    System.out.println("Program ended.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 7);
    }
}