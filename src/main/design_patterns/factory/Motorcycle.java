package main.design_patterns.factory;

public class Motorcycle implements IVehicle{

    @Override
    public void honk() {
        System.out.println("Motorcycle honks");
    }

    @Override
    public void brake() {
        System.out.println("Motorcycle brakes");
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle accelerates");
    }
}
