class Student 
{
    int id=10;
    String name="eran";
    int age=2000000000;
    void displayinfo()
    {
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("id:"+id);
    }
}

class ugstudent extends Student
{
    String Dept="cse";
    
    void display()
    {
        super.displayinfo();
        System.out.println("Dept:"+Dept);
    }
}

public class cl2
{
    public static void main(String[] args){
        ugstudent ug=new ugstudent();
        ug.display();
        
    }
}