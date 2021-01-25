package me.koxrel.designpatterns.template;

public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    public final void play() {
        loadAssets();
        initialize();
        startPlay();
        if (addNewGameCharacter()) {
            addNewCharacterToTheGame();
        }
        endPlay();
    }

    // Hooked-on Template Method
    protected abstract void addNewCharacterToTheGame();

    void loadAssets() {
        System.out.println("Loading Game Assets!");
    }

    // Hook
    boolean addNewGameCharacter() {
        return false;
    }
}
