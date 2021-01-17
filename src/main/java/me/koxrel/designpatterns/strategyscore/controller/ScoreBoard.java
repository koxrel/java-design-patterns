package me.koxrel.designpatterns.strategyscore.controller;

public class ScoreBoard {
    public ScoreAlgorithmBase scoreAlgorithm;

    public void showScore(int taps, int multiplier) {
        System.out.println(scoreAlgorithm.calculateScore(taps, multiplier));
    }
}
