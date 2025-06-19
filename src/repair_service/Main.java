package repair_service;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 4);
        Car car2 = new Car("Audi", 4);

        Truck truck1 = new Truck("Chevrolet", 8);
        Truck truck2 = new Truck("Jeep", 6);

        Bicycle bicycle1 = new Bicycle("BMX", 2);
        Bicycle bicycle2 = new Bicycle("Stern", 2);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(car1);
        serviceStation.check(car2);
        serviceStation.check(truck1);
        serviceStation.check(truck2);
        serviceStation.check(bicycle1);
        serviceStation.check(bicycle2);
    }
}
