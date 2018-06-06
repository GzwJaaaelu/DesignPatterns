package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.commandPattern.demo;

public class RemoteControl {
    private static final int COMMAND_COUNT = 7;

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        //  书中遥控器有七组开关
        onCommands = new Command[7];
        offCommands = new Command[7];

        //  创建默认值
        Command noCommand = new NoCommand();
        undoCommand = noCommand;
        for (int i = 0; i < COMMAND_COUNT; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot,Command onCommand, Command offCommand) {
        //  设置遥控器对应位置的开关操作
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        System.out.println("undo");
        undoCommand.undo();
    }
}
