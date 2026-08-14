class Shape {
    double getArea() {
        return 0;
    }
}

public class rectangle extends Shape {
    double length;
    double width;

    rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }

    public static void main(String[] args) {
        rectangle r = new rectangle(10, 5);

        System.out.println("Area of Rectangle = " + r.getArea());
    }
}

