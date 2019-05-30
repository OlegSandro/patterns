package com.example.facade;

public class PrimaryAccountingWork {

    public void isKept(Boolean isDone) {
        if(isDone.equals(new Boolean(true))){
            System.out.println("Первичный бухгалтерский учёт проведён");
        }else{
            System.out.println("Первичный бухгалтерский учёт не проведён");
        }
    }
}
