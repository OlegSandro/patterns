package com.example.adapter;

public class Smartphone implements ElectronicDevice {

    private DC dc;

    public Smartphone(DC dc) {
        this.dc = dc;
    }

    public void connectToDC() {
        System.out.println("Смартфон: получаю переменный ток");
    }
}
