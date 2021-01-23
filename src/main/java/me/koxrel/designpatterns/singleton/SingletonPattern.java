package me.koxrel.designpatterns.singleton;

import me.koxrel.designpatterns.Driver;

public class SingletonPattern implements Driver {
    @Override
    public void run() {
        Singleton myClass = Singleton.getInstance();
        myClass.name = "Class";
        System.out.println(myClass);
    }
}
