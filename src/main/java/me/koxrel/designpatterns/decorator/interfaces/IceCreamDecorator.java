package me.koxrel.designpatterns.decorator.interfaces;

import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
public class IceCreamDecorator implements IceCream {
    private final IceCream iceCream;

    @Override
    public BigDecimal cost() {
        return iceCream.cost();
    }
}
