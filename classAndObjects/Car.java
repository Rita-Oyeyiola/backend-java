package classAndObjects;

public class Car {
    String brand;
    String model;
    int year;

    public void startCar(){
        System.out.println("The" + model + "is starting");
    }

    public void stopCar(){
        System.out.println("The" + model + "is stopping");
    }

    public static void main(String[] args){
        Car myCar = new Car();
        myCar.brand = "mercedes";
        myCar.model = "benz";
        myCar.year = 2024;

        myCar.startCar();
        myCar.stopCar();
    }
}
