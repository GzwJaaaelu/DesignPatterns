package com.jaaaelu.gzw.design.patterns.commandPattern.demo;

public class Test {

    public static void main(String[] args){
        SimpleRemoteControl control = new SimpleRemoteControl();
        LightOnCommand command = new LightOnCommand(new Light());

        control.setCommand(command);
        control.buttonWasPressed();

        System.out.println("---------------------------------------------------------------");

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, stereoOnCommand, stereoOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        System.out.println("---------------------------------------------------------------");

        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();

        System.out.println("---------------------------------------------------------------");

        MacroCommand partyOn = new MacroCommand(new Command[] {lightOnCommand, stereoOnCommand});
        MacroCommand partyOff = new MacroCommand(new Command[] {lightOffCommand, stereoOffCommand});

        remoteControl.setCommand(6, partyOn, partyOff);
        remoteControl.onButtonWasPushed(6);
        remoteControl.offButtonWasPushed(6);
    }
}
