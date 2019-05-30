package com.example.command;

public class Programmer {

    CleanCommand clean;
    InstallCommand install;
    TomcatRunCommand tomcatRun;

    public Programmer(CleanCommand cleanCommand, InstallCommand installCommand, TomcatRunCommand tomcatRunCommand) {
        this.clean = cleanCommand;
        this.install = installCommand;
        this.tomcatRun = tomcatRunCommand;
    }

    public void mvnClean(){
        clean.execute();
    }

    public void mvnBuild(){
        install.execute();
    }

    public void mvnTomcatRun(){
        tomcatRun.execute();
    }
}
