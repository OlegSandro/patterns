package com.example.Facade;

public class TaxReportsPreparationWork {

    public void isPrepared(Boolean isDone) {
        if(isDone.equals(new Boolean(true))){
            System.out.println("Налоговая ведомость составлена");
        }else{
            System.out.println("Налоговая ведомость не составлена");
        }
    }
}
