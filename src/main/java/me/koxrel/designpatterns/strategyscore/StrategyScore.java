package me.koxrel.designpatterns.strategyscore;

import me.koxrel.designpatterns.Driver;
import me.koxrel.designpatterns.strategyscore.controller.ScoreBoard;
import me.koxrel.designpatterns.strategyscore.model.Balloon;
import me.koxrel.designpatterns.strategyscore.model.Clown;
import me.koxrel.designpatterns.strategyscore.model.SquareBalloon;

public class StrategyScore implements Driver {
    @Override
    public void run() {
        var scoreBoard = new ScoreBoard();

        var taps = 4;
        var multiplier = 2;

        System.out.print("Balloon Tap Score: ");
        scoreBoard.scoreAlgorithm = new Balloon();
        scoreBoard.showScore(taps, multiplier);

        System.out.print("Clown Tap Score: ");
        scoreBoard.scoreAlgorithm = new Clown();
        scoreBoard.showScore(taps, multiplier);

        System.out.print("Square Balloon Tap Score: ");
        scoreBoard.scoreAlgorithm = new SquareBalloon();
        scoreBoard.showScore(taps, multiplier);

    }
}
