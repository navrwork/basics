package com.navr.patterns.behavioral.command;

public class OpenCommand implements Command {

    private int id;

    public OpenCommand(int id) {
        this.id = id;
    }

    @Override
    public void execute() {
        System.out.println("OpenCommand executed. id="+this.id);
    }
}
