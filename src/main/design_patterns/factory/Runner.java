package main.design_patterns.factory;

public class Runner {
    public static void main(String[] args) {

        IVehicle v1 = VehicleFactory.createVehicle(VehicleTypes.CAR);
        v1.accelerate();
        IVehicle v2 = VehicleFactory.createVehicle(VehicleTypes.MOTORCYCLE);
        v2.honk();
    }
}
