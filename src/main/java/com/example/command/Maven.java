package com.example.command;

public class Maven {

    public void clean(){
        System.out.println("mvn clean");
    }

    public void build(){
        System.out.println("mvn build");
    }

    public void tomcatRun(){
        System.out.println("mvn tomcat7:run");
    }
}
