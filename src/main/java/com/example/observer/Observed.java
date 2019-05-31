package com.example.observer;

// Тот, за кем следит наблюдатель
public interface Observed {

    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers();
}
