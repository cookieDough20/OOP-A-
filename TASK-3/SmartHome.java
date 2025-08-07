class Appliance {
    void turnOn() {
        System.out.println("Appliance is turned on.");
    }
}

class Fan extends Appliance {
    void rotate() {
        System.out.println("Fan is rotating.");
    }
}

class CeilingFan extends Fan {
    void setSpeed(int speed) {
        System.out.println("Ceiling fan speed set to " + speed);
    }
}

public class SmartHome {
    public static void main(String[] args) {
        CeilingFan ceilingFan = new CeilingFan();
        ceilingFan.turnOn();         // Appliance
        ceilingFan.rotate();         // Fan
        ceilingFan.setSpeed(3);      // CeilingFan
    }
}
