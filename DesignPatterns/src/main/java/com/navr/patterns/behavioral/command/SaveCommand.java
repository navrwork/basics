package com.navr.patterns.behavioral.command;

public class SaveCommand implements Command {

    private int id;

    public SaveCommand(int id) {
        this.id = id;
    }

    @Override
    public void execute() {
        System.out.println("SaveCommand executed. id="+this.id);
    }
}
