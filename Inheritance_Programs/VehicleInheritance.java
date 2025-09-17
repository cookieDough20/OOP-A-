class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}
class Car extends Vehicle {
    public void fuelType() {
        System.out.println("Car runs on petrol/diesel");
    }
}
public class VehicleInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        car.fuelType();
    }
}