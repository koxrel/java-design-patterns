package me.koxrel.designpatterns.command.model;

import lombok.RequiredArgsConstructor;
import me.koxrel.designpatterns.command.interfaces.Command;

@RequiredArgsConstructor
public class KirbyRightCommand implements Command {
    private final KirbyCharacterReceiver kirbyCharacter;

    @Override
    public void execute() {
        kirbyCharacter.moveRight();
    }
}
