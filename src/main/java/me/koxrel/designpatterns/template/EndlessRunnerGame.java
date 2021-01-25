package me.koxrel.designpatterns.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EndlessRunnerGame extends Game {
    @Override
    void initialize() {
        System.out.println("Endless Runner initializing...");
    }

    @Override
    void startPlay() {
        System.out.println("Endless Runner starting...");
    }

    @Override
    void endPlay() {
        System.out.println("Endless Runner ending...");
    }

    @Override
    protected void addNewCharacterToTheGame() {
        System.out.println("Adding new character to the game...");
    }

    public boolean playerWantsNewCharacter() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;

        System.out.print("Would you like to add a new character to the game? (y/n) ");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.out.println("IO Error");
        }

        if (answer == null) {
            return "no";
        }

        return answer;
    }

    @Override
    boolean addNewGameCharacter() {
        return playerWantsNewCharacter();
    }

    // Add more methods...
}
