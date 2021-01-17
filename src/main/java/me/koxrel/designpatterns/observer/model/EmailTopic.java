package me.koxrel.designpatterns.observer.model;

import lombok.NonNull;
import me.koxrel.designpatterns.observer.interfaces.Observer;
import me.koxrel.designpatterns.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String message;

    @Override
    public void register(@NonNull Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String message) {
        System.out.printf("Message posted to my topic: %s\n", message);
        this.message = message;
        notifyObservers();
    }
}
