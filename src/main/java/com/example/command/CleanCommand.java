package com.example.command;

public class CleanCommand implements Command {

    Maven maven;

    public CleanCommand(Maven maven) {
        this.maven = maven;
    }

    public void execute() {
        maven.clean();
    }
}
