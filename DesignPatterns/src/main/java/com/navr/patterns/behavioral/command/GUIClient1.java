package com.navr.patterns.behavioral.command;

/**
 * <b>Command</b> is a behavioral design pattern that turns a request
 * into a stand-alone object that contains all information about
 * the request. This transformation lets you pass requests as a
 * method arguments, delay or queue a request’s execution, and
 * support undoable operations.
 * <br/><br/>
 * Good software design is often based on the principle of separation
 * of concerns, which usually results in breaking an app
 * into layers. The most common example: a layer for the graphical
 * user interface and another layer for the business logic.
 * <br/><br/>
 * The Command pattern suggests that GUI objects shouldn’t
 * send these requests directly. Instead, you should extract all of
 * the request details, such as the object being called, the name
 * of the method and the list of arguments into a separate command
 * class with a single method that triggers this request.
 * <br/><br/>
 * Reference: <a href="https://refactoring.guru/design-patterns/command">Command pattern</a>
 */
public class GUIClient1 {
    public static void main(String[] args) {
        Command openCommand = new OpenCommand(1);
        openCommand.execute();

        Command saveCommand = new SaveCommand(1);
        saveCommand.execute();

        Command printCommand = new PrintCommand(1);
        printCommand.execute();
    }
}
