package me.koxrel.designpatterns.facade;

public class CPU {
    public void freeze() {
        System.out.println("Computer freezing...");
    }

    public void jump(long position) {
        System.out.printf("Jumping to %d...\n", position);
    }

    public void execute() {
        System.out.println("Computer executing commands...");
    }
}
