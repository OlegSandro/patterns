package com.example.command;

public class Programmer {

    CleanCommand clean;
    BuildCommand build;
    TomcatRunCommand tomcatRun;

    public Programmer(CleanCommand cleanCommand, BuildCommand buildCommand, TomcatRunCommand tomcatRunCommand) {
        this.clean = cleanCommand;
        this.build = buildCommand;
        this.tomcatRun = tomcatRunCommand;
    }

    public void mvnClean(){
        clean.execute();
    }

    public void mvnBuild(){
        build.execute();
    }

    public void mvnTomcatRun(){
        tomcatRun.execute();
    }
}
