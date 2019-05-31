package com.example.delegate;

// Бармен
public class Barman implements DishMaker {

    public void provideDish() {
        System.out.println("Вот Ваша выпивка");
    }
}
