class calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
    void display(){
        System.out.println("This is basic calculator");
    }
}
class advancedCalculator extends calculator 
{   @Override
    void display(){
        System.out.println("This is advanced calculator");
    }
}


public class overloding {
    public static void main(String[] args) {
        calculator c = new calculator();
        c.display();
        advancedCalculator ac = new advancedCalculator();
        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
        System.out.println(c.add(10.5, 20.5));
        ac.display();
    }
}
