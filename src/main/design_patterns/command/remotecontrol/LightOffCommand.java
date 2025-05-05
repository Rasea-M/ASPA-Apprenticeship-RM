package main.design_patterns.command.remotecontrol;

import main.design_patterns.command.appliances.Light;

public class LightOffCommand implements ICommand{
    private final Light receiver;

    public LightOffCommand(Light receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOff();
    }

    @Override
    public void printStatus() {
        receiver.status();
    }
}
