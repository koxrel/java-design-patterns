package me.koxrel.designpatterns.command.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MarioCharacterReceiver {
    private String name;

    public void moveUp() {
        System.out.printf("%s jumping up!\n", getName());
    }

    public void moveLeft() {
        System.out.printf("%s moving left!\n", getName());
    }

    public void moveRight() {
        System.out.printf("%s moving right!\n", getName());
    }

    public void moveDown() {
        System.out.printf("%s moving down!\n", getName());
    }
}
