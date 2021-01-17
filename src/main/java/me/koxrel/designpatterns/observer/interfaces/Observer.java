package me.koxrel.designpatterns.observer.interfaces;

public interface Observer {
    void update();

    void setSubject(Subject subject);
}
