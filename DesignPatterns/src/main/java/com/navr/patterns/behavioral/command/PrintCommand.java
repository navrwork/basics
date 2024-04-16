package com.navr.patterns.behavioral.command;

public class PrintCommand implements Command {

    private int id;

    public PrintCommand(int id) {
        this.id = id;
    }

    @Override
    public void execute() {
        System.out.println("PrintCommand executed. id="+this.id);
    }
}
