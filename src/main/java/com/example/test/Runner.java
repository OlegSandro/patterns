package com.example.test;

import com.example.command.*;
import com.example.facade.*;
import com.example.factorymethod.*;
import com.example.singleton.*;
import com.example.adapter.*;

public class Runner {

    public static void main(String[] args){

        System.out.println("Start");

        //Singletone testing
        System.out.println("\n1. Singletone testing...");
        Earth planet1 = Earth.getInstance();
        System.out.println("Первый объект класса Planet создан. Его текстовое представление - " + planet1);
        Earth planet2 = Earth.getInstance();
        System.out.println("Второй объект класса Planet создан. Его текстовое представление - " + planet2);
        if(planet1 == planet2){
            System.out.println("Объект planet1 (" + planet1 + ") является объектом planet2 (" + planet2 + ")");
        }else{
            System.out.println("Объект planet1 (" + planet1 + ") не является объектом planet2 (" + planet2 + ")");
        }

        //Adapter testing
        System.out.println("\n2. Adapter testing...");
        //Потребителя переменного тока удаётся подключить к источнику переменного тока
        //т.е. лампу (электрическое устройство) удаётся подключить к розетке
        /*AC ac = new AC(new Float(220), new Float(0.3), new Integer(60));
        Lamp lamp = new Lamp(ac);
        Outlet220V outlet220V = new Outlet220V();
        outlet220V.supplyAC(lamp);*/

        //Потребителя постоянного тока не удаётся подключить к источнику переменного тока
        //т.е. смартфон (электронное устройство) не удаётся подключить к розетке
        /*DC dc = new DC(new Float(5), new Float(1.55));
        Smartphone smartphone = new Smartphone(dc);
        Outlet220V outlet220V = new Outlet220V();
        outlet220V.supplyAC(smartphone);*/

        //Потребителя постоянного тока удаётся подключить к источнику переменного тока благодаря адаптеру
        //т.е. смартфон (электронное устройство) удаётся подключить к розетке посредством адаптера
        DC dc = new DC(new Float(5), new Float(1.55));
        Smartphone smartphone = new Smartphone(dc);
        Outlet220V outlet220V = new Outlet220V();
        outlet220V.supplyAC(new ChargeAdapter(smartphone));

        //facade testing
        System.out.println("\n3. Facade testing...");
        //Бухгалтер отмечает, что:
        //выполнил ведение первичного учёта,
        //выполнил начисление зарплаты,
        //выполнил подготовку налоговой ведомости
        /*PrimaryAccountingWork primaryAccountingWork = new PrimaryAccountingWork();
        primaryAccountingWork.isKept(true);
        SalaryCalculatingWork salaryCalculatingWork = new SalaryCalculatingWork();
        salaryCalculatingWork.isCalculated(true);
        TaxReportsPreparationWork taxReportsPreparationWork = new TaxReportsPreparationWork();
        taxReportsPreparationWork.isPrepared(true);*/

        //Бухгалтер отмечает, что выполнил свою работу
        AccountantWork accountantWork = new AccountantWork();
        accountantWork.isDone(true);

        //Command testing
        System.out.println("\n4. Command testing...");
        Maven maven = new Maven();
        Programmer programmer = new Programmer(new CleanCommand(maven),
                new InstallCommand(maven), new TomcatRunCommand(maven));
        programmer.mvnClean();
        programmer.mvnBuild();
        programmer.mvnTomcatRun();

        //Singletone testing
        System.out.println("\n5. Factory Method testing...");
        GameGenerator generator = new HardLevelGameGenerator(); /*new EasyLevelGameGenerator();*/
        Game game = generator.createGame();
        game.run();

        System.out.println("\nFinish");

    }
}
