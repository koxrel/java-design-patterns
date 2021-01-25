package me.koxrel.designpatterns.template;

import me.koxrel.designpatterns.Driver;

public class TemplatePattern implements Driver {
    @Override
    public void run() {
        Game game = new EndlessRunnerGame();
        game.play();

        System.out.println("=====");
        game = new FootballGame();
        game.play();
    }
}
