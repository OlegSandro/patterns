package com.example.observer;

import java.util.ArrayList;
import java.util.List;

// Тот, за кем следит наблюдатель (реализация)
public class Subscribed implements Observed {

    private String name = "Роман Киреев";
    private String status;

    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for(Observer observer : observers){
            observer.handleEvent(name, status);
        }
    }

    public void setStatus(String status){
        this.status = status;
        notifyObservers();
    }
}
