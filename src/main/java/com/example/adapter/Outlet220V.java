package com.example.adapter;

public class Outlet220V {

    public void supplyAC(ElectricalDevice electricalDevice){
        System.out.println("Розетка: отдаю переменный ток");
        electricalDevice.connectToAC();
    }
}
