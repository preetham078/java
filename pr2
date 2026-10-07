class Student {
    String studentID;
    String studentName;
    String department;

    Student(String studentID, String studentName, String department) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.department = department;
    }

    void displayStudentDetails() {
        System.out.println("Student Details");
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Department: " + department);
    }
}

class UndergraduateStudent extends Student {
    int semester;
    double cgpa;

    UndergraduateStudent(String studentID, String studentName,
                         String department, int semester, double cgpa) {
        super(studentID, studentName, department);
        this.semester = semester;
        this.cgpa = cgpa;
    }

    void displayUGDetails() {
        System.out.println("Undergraduate Details");
        System.out.println("Sem: " + semester);
        System.out.println("CGPA: " + cgpa);
    }
}

class PostgraduateStudent extends Student {
    String specialization;
    String researchTopic;

    PostgraduateStudent(String studentID, String studentName,
                        String department, String specialization,
                        String researchTopic) {
        super(studentID, studentName, department);
        this.specialization = specialization;
        this.researchTopic = researchTopic;
    }

    void displayPGDetails() {
        System.out.println("Postgraduate Details");
        System.out.println("Specialization: " + specialization);
        System.out.println("Research Topic: " + researchTopic);
    }
}

class StudentManagement {
    public static void main(String[] args) {

        UndergraduateStudent ug1 =
            new UndergraduateStudent("101", "Ravi", "CSE", 5, 8.75);

        ug1.displayStudentDetails();
        ug1.displayUGDetails();

        PostgraduateStudent pg1 =
            new PostgraduateStudent("201", "Anita", "ECE",
                                    "AI", "Computer Vision");

        pg1.displayStudentDetails();
        pg1.displayPGDetails();
    }
}
