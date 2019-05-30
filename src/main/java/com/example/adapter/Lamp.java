package com.example.adapter;

public class Lamp implements ElectricalDevice {

    private AC ac;

    public Lamp(AC ac) {
        this.ac = ac;
    }

    public void connectToAC() {
        System.out.println("Лампа: получаю переменный ток");
    }
}
