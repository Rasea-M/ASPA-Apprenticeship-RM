package main.design_patterns.command;

import main.design_patterns.command.appliances.Fan;
import main.design_patterns.command.appliances.Light;
import main.design_patterns.command.remotecontrol.FanOnCommand;
import main.design_patterns.command.remotecontrol.LightOffCommand;
import main.design_patterns.command.remotecontrol.LightOnCommand;
import main.design_patterns.command.remotecontrol.RemoteControl;

public class Runner {

    public static void main(String[] args) {

        Light light1 = new Light();
        Fan fan1 = new Fan();

        RemoteControl remoteControl = new RemoteControl();

        //FanOnCommand
        remoteControl.setCommand(new FanOnCommand(fan1));
        remoteControl.pressButton();
        remoteControl.statusButton();

        //LightOnCommand
        remoteControl.setCommand(new LightOnCommand(light1));
        remoteControl.pressButton();
        remoteControl.statusButton();

        //LightOffCommand
        remoteControl.setCommand(new LightOffCommand(light1));
        remoteControl.pressButton();
        remoteControl.statusButton();
    }
}
