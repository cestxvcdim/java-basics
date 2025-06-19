package repair_service;

public class Bicycle extends Vehicle implements VehicleInterface {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда.");
    }

    @Override
    public void checkEngine() {
        VehicleInterface.super.checkEngine();
    }

    @Override
    public void checkTrailer() {
        VehicleInterface.super.checkTrailer();
    }
}
