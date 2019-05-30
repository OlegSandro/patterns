package com.example.command;

public class Maven {

    public void clean(){
        System.out.println("mvn clean");
    }

    public void install(){
        System.out.println("mvn install");
    }

    public void tomcatRun(){
        System.out.println("mvn tomcat7:run");
    }
}
