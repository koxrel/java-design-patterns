package me.koxrel.designpatterns.factory.model;

import me.koxrel.designpatterns.factory.interfaces.HamburgerStore;

public class JamHamburgerStore extends HamburgerStore {
    @Override
    protected Hamburger createHamburger(String type) {
        return switch (type) {
            case "cheese" -> new JamaicanCheeseBurger();
            case "greek" -> new JamaicanGreekBurger();
            default -> null;
        };
    }
}
