package main.design_patterns.factory;

public class Car implements IVehicle{
    @Override
    public void honk() {
        System.out.println("Car honks");
    }

    @Override
    public void brake() {
        System.out.println("Car brakes");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerates");
    }
}
