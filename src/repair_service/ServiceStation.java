package repair_service;

public class ServiceStation {
    public <T extends Vehicle & VehicleInterface> void check(T vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName() + '.');
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
        vehicle.checkEngine();
        vehicle.checkTrailer();
    }
}
