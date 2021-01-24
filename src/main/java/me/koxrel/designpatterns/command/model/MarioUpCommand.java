package me.koxrel.designpatterns.command.model;

import lombok.RequiredArgsConstructor;
import me.koxrel.designpatterns.command.interfaces.Command;

@RequiredArgsConstructor
public class MarioUpCommand implements Command {
    private final MarioCharacterReceiver marioCharacter;

    @Override
    public void execute() {
        marioCharacter.moveUp();
    }
}
