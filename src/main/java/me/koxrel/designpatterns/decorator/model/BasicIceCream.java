package me.koxrel.designpatterns.decorator.model;

import me.koxrel.designpatterns.decorator.interfaces.IceCream;

import java.math.BigDecimal;

public class BasicIceCream implements IceCream {
    public BasicIceCream() {
        System.out.println("Creating a BasicIceCream.");
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("0.5");
    }
}
