package com.example.delegate;

// Повар
public class Cook implements DishMaker {

    public void provideDish() {
        System.out.println("Вот Ваша еда");
    }
}
