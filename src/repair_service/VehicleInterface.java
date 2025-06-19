package repair_service;

public interface VehicleInterface {
    void updateTyre();
    default void checkEngine() {
        System.out.println("Двигатель отсутствует.");
    };
    default void checkTrailer() {
        System.out.println("Прицеп отсутствует.");
    };
}
