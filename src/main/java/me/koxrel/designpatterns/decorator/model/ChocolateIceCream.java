package me.koxrel.designpatterns.decorator.model;

import me.koxrel.designpatterns.decorator.interfaces.IceCream;
import me.koxrel.designpatterns.decorator.interfaces.IceCreamDecorator;

import java.math.BigDecimal;

public class ChocolateIceCream extends IceCreamDecorator {
    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public BigDecimal cost() {
        System.out.println("Adding Chocolate Ice Cream.");
        return new BigDecimal("1.0").add(super.cost());
    }
}
