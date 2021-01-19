package me.koxrel.designpatterns.factory.model;

import me.koxrel.designpatterns.factory.interfaces.HamburgerStore;

public class MozHamburgerStore extends HamburgerStore {
    @Override
    protected Hamburger createHamburger(String type) {
        return switch (type) {
            case "cheese" -> new MozambicanCheeseBurger();
            case "greek" -> new MozambicanGreekBurger();
            default -> null;
        };
    }
}
