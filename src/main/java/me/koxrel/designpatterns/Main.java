package me.koxrel.designpatterns;

import lombok.RequiredArgsConstructor;
import me.koxrel.designpatterns.adapter.AdapterPattern;
import me.koxrel.designpatterns.command.CommandPattern;
import me.koxrel.designpatterns.decorator.DecoratorPattern;
import me.koxrel.designpatterns.facade.FacadePattern;
import me.koxrel.designpatterns.factory.FactoryPattern;
import me.koxrel.designpatterns.observer.ObserverPattern;
import me.koxrel.designpatterns.singleton.SingletonPattern;
import me.koxrel.designpatterns.strategypayment.StrategyPayment;
import me.koxrel.designpatterns.strategyscore.StrategyScore;

@RequiredArgsConstructor
enum PatternExample {
    STRATEGY_SCORE(new StrategyScore()),
    STRATEGY_PAYMENT(new StrategyPayment()),
    OBSERVER(new ObserverPattern()),
    DECORATOR(new DecoratorPattern()),
    FACTORY(new FactoryPattern()),
    SINGLETON(new SingletonPattern()),
    COMMAND(new CommandPattern()),
    ADAPTER(new AdapterPattern()),
    FACADE(new FacadePattern());

    private final Driver patternDriver;

    public void runDriver() {
        patternDriver.run();
    }
}

public class Main {
    public static void main(String[] args) {
        var pattern = PatternExample.FACADE;
        pattern.runDriver();

        boolean v = false;
        if (v == true) {
            System.out.println("True");
        } else if (v == false) {
            System.out.println("False");
        } else {
            System.out.println("never gonna happen!");
        }
    }
}
