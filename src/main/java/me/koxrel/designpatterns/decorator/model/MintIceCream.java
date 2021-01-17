package me.koxrel.designpatterns.decorator.model;

import me.koxrel.designpatterns.decorator.interfaces.IceCream;
import me.koxrel.designpatterns.decorator.interfaces.IceCreamDecorator;

import java.math.BigDecimal;

public class MintIceCream extends IceCreamDecorator {
    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public BigDecimal cost() {
        System.out.println("Adding Mint Ice Cream.");
        return new BigDecimal("1.5").add(super.cost());
    }
}
