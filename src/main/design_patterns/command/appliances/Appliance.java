package main.design_patterns.command.appliances;

public abstract class Appliance {
    private boolean power;

    public void turnOn(){
        this.power = true;
    }

    public void turnOff(){
        this.power = false;
    }

    public void status() {
        System.out.println("This " + this.getClass().getSimpleName() + " is currently: " + (this.power ? "ON" : "OFF"));
    }
}
