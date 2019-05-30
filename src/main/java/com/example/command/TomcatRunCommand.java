package com.example.command;

public class TomcatRunCommand implements Command {

    Maven maven;

    public TomcatRunCommand(Maven maven) {
        this.maven = maven;
    }

    public void execute() {
        maven.tomcatRun();
    }
}
