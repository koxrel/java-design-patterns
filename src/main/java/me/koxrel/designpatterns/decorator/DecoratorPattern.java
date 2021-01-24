package me.koxrel.designpatterns.decorator;

import me.koxrel.designpatterns.Driver;
import me.koxrel.designpatterns.decorator.interfaces.IceCream;
import me.koxrel.designpatterns.decorator.model.BasicIceCream;
import me.koxrel.designpatterns.decorator.model.MintIceCream;
import me.koxrel.designpatterns.decorator.model.VanillaIceCream;

public class DecoratorPattern implements Driver {
    @Override
    public void run() {
        IceCream basicIceCream = new BasicIceCream();
        System.out.printf("Basic Ice Cream cost: $%.2f\n", basicIceCream.cost());

        IceCream vanilla = new VanillaIceCream(basicIceCream);
        System.out.printf("Vanilla + Basic Ice Cream cost: $%.2f\n", vanilla.cost());

        IceCream mint = new MintIceCream(vanilla);
        System.out.printf("Mint + Vanilla + Basic Ice Cream cost: $%.2f\n", mint.cost());
    }
}
