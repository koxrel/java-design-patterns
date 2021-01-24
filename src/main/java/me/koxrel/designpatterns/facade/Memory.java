package me.koxrel.designpatterns.facade;

public class Memory {
    public void load(long position, byte[] data) {
        System.out.printf("Added item to memory %d.\n", position);
    }
}
