package repair_service;

public class Car extends Vehicle implements VehicleInterface {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку машины.");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель машины.");
    }

    @Override
    public void checkTrailer() {
        VehicleInterface.super.checkTrailer();
    }
}
