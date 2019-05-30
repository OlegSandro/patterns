package com.example.Facade;

public class AccountantWork {

    private PrimaryAccountingWork primaryAccountingWork;
    private SalaryCalculatingWork salaryCalculatingWork;
    private TaxReportsPreparationWork taxReportsPreparationWork;

    public AccountantWork() {
        primaryAccountingWork = new PrimaryAccountingWork();
        salaryCalculatingWork = new SalaryCalculatingWork();
        taxReportsPreparationWork = new TaxReportsPreparationWork();
    }

    public void isDone(Boolean isDone){
        primaryAccountingWork.isKept(isDone);
        salaryCalculatingWork.isCalculated(isDone);
        taxReportsPreparationWork.isPrepared(isDone);
    }
}
