class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

public class Car extends Vehicle {

    @Override
    void drive() {
        System.out.println("Driving a car");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}