package com.example.command;

public class InstallCommand implements Command {

    Maven maven;

    public InstallCommand(Maven maven) {
        this.maven = maven;
    }

    public void execute() {
        maven.install();
    }
}
