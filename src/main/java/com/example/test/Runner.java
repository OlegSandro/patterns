package com.example.test;

import com.example.singleton.Earth;

public class Runner {

    public static void main(String[] args){

        System.out.println("Start");

        //Singletone testing
        System.out.println("\nSingletone testing...");
        Earth planet1 = Earth.getInstance();
        Earth planet2 = Earth.getInstance();
        if(planet1 == planet2){
            System.out.println("The object planet1 (" + planet1 + ") is the object planet2 (" + planet2 + ")");
        }else{
            System.out.println("The object planet1 (" + planet1 + ") isn't the object planet2 (" + planet2 + ")");
        }

        System.out.println("Finish");
    }
}
