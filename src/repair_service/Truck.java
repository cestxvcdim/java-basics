package repair_service;

public class Truck extends Vehicle implements VehicleInterface {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку грузовика.");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель машины.");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп машины.");
    }
}
