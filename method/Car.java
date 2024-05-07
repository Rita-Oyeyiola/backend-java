package method;

public class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Car is driving");
    }

    void drive(int speed){
        System.out.println("car is driving at" + speed + "km/h");
    }
}
