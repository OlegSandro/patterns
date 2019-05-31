package com.example.delegate;

// Официант
public class Waiter {

    private DishMaker dishMaker;

    public void setDishMaker(DishMaker dishMaker) {
        this.dishMaker = dishMaker;
    }

    // метод, реализующий шаблон проектирования делегат
    public void provideDish(){
        dishMaker.provideDish();
    }
}
