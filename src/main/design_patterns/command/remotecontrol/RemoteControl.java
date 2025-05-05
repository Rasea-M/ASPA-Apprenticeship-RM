package main.design_patterns.command.remotecontrol;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {

    private final List<ICommand> commands = new ArrayList<>();

    public void setCommand(ICommand command) {
        commands.add(command);
    }

    public void pressButton() {
        commands.getLast().execute();
    }

    public void statusButton() {
        commands.getLast().printStatus();
    }
}
