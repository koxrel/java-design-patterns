package me.koxrel.designpatterns.command.model;

import lombok.RequiredArgsConstructor;
import me.koxrel.designpatterns.command.interfaces.Command;

@RequiredArgsConstructor
public class GameBoy {
    private final Command UpCommand, DownCommand, LeftCommand, RightCommand;

    public void arrowUp() {
        UpCommand.execute();
    }

    public void arrowDown() {
        DownCommand.execute();
    }

    public void arrowLeft() {
        LeftCommand.execute();
    }

    public void arrowRight() {
        RightCommand.execute();
    }
}
