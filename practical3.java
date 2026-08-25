class Vehicle{
    String VehicleNumber;
    String brand;
    
    Vehicle(String VehicleNumber,String brand){
        this.VehicleNumber=VehicleNumber;
        this.brand=brand;
    }
    void StartEngine(){
        
} 
    void display(){
        System.out.println("Vehicle Number: "+VehicleNumber);
        System.out.println("Brand: "+brand);
    }
}

class car extends Vehicle{
    car(String VehicleNumber, String brand){
        super(VehicleNumber, brand);
    }

    @Override
    void StartEngine(){
        System.out.println("car engine starting starting process");
    }
    void display(){
        System.out.println("Vehicle Number: "+VehicleNumber);
        System.out.println("Brand: "+brand);
    }
}
class bike  extends Vehicle{
    bike(String VehicleNumber, String brand){
        super(VehicleNumber, brand);
    }

    @Override
    void StartEngine(){
        System.out.println("bike engine starting process");
    }
    void display(){
        System.out.println("Vehicle Number: "+VehicleNumber);
        System.out.println("Brand: "+brand);
    }
}

    

public class practical3 {
    public static void main(String args[]){
        car c=new car("KA-01-1234","Toyota");
        c.display();
        c.StartEngine();
        bike b=new bike("KA-01-5678","Yamaha");
        b.display();
        b.StartEngine();
    }
    
}
