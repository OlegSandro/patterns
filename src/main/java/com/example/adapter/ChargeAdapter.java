package com.example.adapter;

public class ChargeAdapter implements ElectricalDevice {

    private ElectronicDevice electronicDevice;

    public ChargeAdapter(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    public void connectToAC() {
        System.out.println("Адаптер питания: получаю переменный ток");
        this.transformAC2DC();
        electronicDevice.connectToDC();
    }

    private void transformAC2DC(){
        System.out.println("Адаптер питания: преобразовую переменный ток в постоянный ток");
        this.supplyDC(electronicDevice);
    }

    private void supplyDC(ElectronicDevice electronicDevice){
        System.out.println("Адаптер питания: отдаю постоянный ток");
    }
}
