package me.koxrel.designpatterns.observer.interfaces;

public interface Subject {
    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();

    Object getUpdate(Observer observer);

}
