package com.example.facade;

public class SalaryCalculatingWork {

    public void isCalculated(Boolean isDone) {
        if(isDone.equals(new Boolean(true))){
            System.out.println("Заработная плата начислена");
        }else{
            System.out.println("Заработная плата не начислена");
        }
    }
}
