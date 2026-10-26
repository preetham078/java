import java.util.*;

interface SmartDevice {
    void turnOn();
    void turnOff();
}

class SmartFan implements SmartDevice {
    private int speed;

    SmartFan(int speed) {
        this.speed = speed;
    }

    public void turnOn() {
        System.out.println("Smart Fan is ON");
        System.out.println("Fan speed: " + speed);
    }

    public void turnOff() {
        System.out.println("Smart Fan is OFF");
    }
}

class SmartLight implements SmartDevice {
    private int brightness;

    SmartLight(int brightness) {
        this.brightness = brightness;
    }

    public void turnOn() {
        System.out.println("Smart Light is ON");
        System.out.println("Brightness: " + brightness);
    }

    public void turnOff() {
        System.out.println("Smart Light is OFF");
    }
}

class SmartAC implements SmartDevice {
    private int temperature;

    SmartAC(int temperature) {
        this.temperature = temperature;
    }

    public void turnOn() {
        System.out.println("Smart AC is ON");
        System.out.println("Temperature: " + temperature + "°C");
    }

    public void turnOff() {
        System.out.println("Smart AC is OFF");
    }
}

public class SmartHomeDemo {
    public static void main(String[] args) {

        SmartDevice fan = new SmartFan(3);
        SmartDevice light = new SmartLight(80);
        SmartDevice ac = new SmartAC(24);

        List<SmartDevice> devices = new ArrayList<>();

        devices.add(fan);
        devices.add(light);
        devices.add(ac);

        System.out.println("=== Turning ON Devices ===");

        for (SmartDevice device : devices) {
            device.turnOn();
            System.out.println();
        }

        System.out.println("=== Turning OFF Devices ===");

        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }
}
