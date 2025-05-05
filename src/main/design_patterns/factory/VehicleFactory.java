package main.design_patterns.factory;

public class VehicleFactory {
    public static IVehicle createVehicle(VehicleTypes type) {
        return switch (type) {
            case CAR -> new Car();
            case MOTORCYCLE -> new Motorcycle();
        };
    }
}
