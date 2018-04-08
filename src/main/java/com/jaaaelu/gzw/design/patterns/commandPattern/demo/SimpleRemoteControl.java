package com.jaaaelu.gzw.design.patterns.commandPattern.demo;

public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        if (slot != null) {
            slot.execute();
        } else {
            System.out.println("Nothing execute");
        }
    }
}
