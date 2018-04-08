package com.jaaaelu.gzw.design.patterns.commandPattern.demo;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Nothing execute");
    }

    @Override
    public void undo() {
        System.out.println("Nothing undo");
    }
}
