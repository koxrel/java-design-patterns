package me.koxrel.designpatterns.singleton;

public class Singleton {
    // Eager instantiation
    // private static Singleton uniqueInstance = new Singleton();

    private volatile static Singleton uniqueInstance;
    String name;

    private Singleton() {
    }

    public static Singleton getInstance() {
        // Double-check locking
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
