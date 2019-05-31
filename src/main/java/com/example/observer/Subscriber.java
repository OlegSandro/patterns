package com.example.observer;

// Наблюдатель (реализация)
public class Subscriber implements Observer {

    public void handleEvent(String name, String status) {
        System.out.println(name + " обновил(а) статус: " + status);
    }
}
