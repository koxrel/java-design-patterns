package me.koxrel.designpatterns.singleton;

public class MyClass {
    private static MyClass uniqueInstance;
    String name;

    private MyClass() {
    }

    // Synchronized for thread-safety
    public static synchronized MyClass getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MyClass();
        }
        return uniqueInstance;
    }
}
