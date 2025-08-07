// Parent class
class Vehicle {
    void move() {
        System.out.println("Vehicle is moving.");
    }
}

// Child class
class Car extends Vehicle {
    void fuelType() {
        System.out.println("Car uses petrol or diesel.");
    }
}

// Main method
public class VehicleApp {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();      // inherited
        car.fuelType();  // specific
    }
}
