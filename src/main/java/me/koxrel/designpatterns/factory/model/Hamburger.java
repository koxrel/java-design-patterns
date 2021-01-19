package me.koxrel.designpatterns.factory.model;

import lombok.Getter;

public abstract class Hamburger {
    @Getter
    public String name;
    public String sauce;
    public String buns;

    public void prepare() {
        System.out.printf("Preparing %s.\nAdding sauce... %s\nAdding buns... %s\n", name, sauce, buns);
    }
    public void cook() {
        System.out.println("Cooking...");
    }
    public void box() {
        System.out.println("Boxing...");
    }
}
