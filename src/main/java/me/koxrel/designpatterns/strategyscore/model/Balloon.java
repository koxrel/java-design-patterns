package me.koxrel.designpatterns.strategyscore.model;

import me.koxrel.designpatterns.strategyscore.controller.ScoreAlgorithmBase;

public class Balloon extends ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 20;
    }
}
