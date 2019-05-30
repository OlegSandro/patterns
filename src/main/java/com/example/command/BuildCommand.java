package com.example.command;

public class BuildCommand implements Command {

    Maven maven;

    public BuildCommand(Maven maven) {
        this.maven = maven;
    }

    public void execute() {
        maven.build();
    }
}
