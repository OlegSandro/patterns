package com.example.singleton;

/*
Class which is an example of the singletone pattern
 */
public class Earth {

    private static Earth instance;
    private int diameter;
    private long population;

    private Earth() {
        diameter = 12742;
        population = 7700000000L;
    }

    public static Earth getInstance(){
        if(instance == null){
            instance = new Earth();
        }
        return instance;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
