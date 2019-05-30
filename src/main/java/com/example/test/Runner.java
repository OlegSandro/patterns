package com.example.test;

import com.example.singleton.*;
import com.example.adapter.*;

public class Runner {

    public static void main(String[] args){

        System.out.println("Start");

        //Singletone testing
        System.out.println("\n1. Singletone testing...");
        Earth planet1 = Earth.getInstance();
        Earth planet2 = Earth.getInstance();
        if(planet1 == planet2){
            System.out.println("Объект planet1 (" + planet1 + ") является объектом planet2 (" + planet2 + ")");
        }else{
            System.out.println("Объект planet1 (" + planet1 + ") не является объектом planet2 (" + planet2 + ")");
        }

        //Adapter testing
        System.out.println("\n2. Adapter testing...");
        //Потребителя переменного тока удаётся подключить к источнику переменного тока
        //Лампу (электрическое устройство удаётся подключить к розетке)
        /*AC ac = new AC(new Float(220), new Float(0.3), new Integer(60));
        Lamp lamp = new Lamp(ac);
        Outlet220V outlet220V = new Outlet220V();
        outlet220V.supplyAC(lamp);*/

        //Потребителя постоянного тока не удаётся подключить к источнику переменного тока
        //Смартфон (электронное устройство) не удаётся подключить к розетке
        /*DC dc = new DC(new Float(5), new Float(1.55));
        Smartphone smartphone = new Smartphone(dc);
        Outlet220V outlet220V = new Outlet220V();
        outlet220V.supplyAC(smartphone);*/

        //Потребителя постоянного тока удаётся подключить к источнику переменного тока благодаря адаптеру
        //Смартфон (электронное устройство) удаётся подключить к розетке
        DC dc = new DC(new Float(5), new Float(1.55));
        Smartphone smartphone = new Smartphone(dc);
        Outlet220V outlet220V = new Outlet220V();
        outlet220V.supplyAC(new ChargeAdapter(smartphone));

        System.out.println("Finish");
    }
}
