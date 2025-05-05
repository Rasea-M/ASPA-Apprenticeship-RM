package main.design_patterns.command.remotecontrol;

import main.design_patterns.command.appliances.Fan;

public class FanOnCommand implements ICommand {

    private final Fan receiver;

    public FanOnCommand(Fan receiver) {
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
