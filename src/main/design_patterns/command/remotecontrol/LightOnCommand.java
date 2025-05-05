package main.design_patterns.command.remotecontrol;

import main.design_patterns.command.appliances.Light;

public class LightOnCommand implements ICommand {

    private final Light receiver;

    public LightOnCommand(Light receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOn();
    }

    @Override
    public void printStatus() {
        receiver.status();
    }
}
