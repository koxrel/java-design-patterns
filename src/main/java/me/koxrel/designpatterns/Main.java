package me.koxrel.designpatterns;

import lombok.RequiredArgsConstructor;
import me.koxrel.designpatterns.decorator.Decorator;
import me.koxrel.designpatterns.factory.Factory;
import me.koxrel.designpatterns.observer.Observer;
import me.koxrel.designpatterns.singleton.SingletonPattern;
import me.koxrel.designpatterns.strategypayment.StrategyPayment;
import me.koxrel.designpatterns.strategyscore.StrategyScore;

@RequiredArgsConstructor
enum PatternExample {
    STRATEGY_SCORE(new StrategyScore()), STRATEGY_PAYMENT(new StrategyPayment()), OBSERVER(new Observer()), DECORATOR(new Decorator()), FACTORY(new Factory()), SINGLETON(new SingletonPattern());

    private final Driver patternDriver;

    public void runDriver() {
        patternDriver.run();
    }
}

public class Main {
    public static void main(String[] args) {
        var pattern = PatternExample.SINGLETON;
        pattern.runDriver();
    }
}
