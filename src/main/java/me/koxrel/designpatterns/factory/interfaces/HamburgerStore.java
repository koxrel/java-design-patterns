package me.koxrel.designpatterns.factory.interfaces;

import me.koxrel.designpatterns.factory.model.Hamburger;

public abstract class HamburgerStore {

    public Hamburger orderHamburger(String type) {
        var burger = createHamburger(type);

        burger.prepare();
        burger.cook();
        burger.box();

        return burger;
    }

    protected abstract Hamburger createHamburger(String type);
}
