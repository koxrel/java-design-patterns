package me.koxrel.designpatterns.factory.interfaces;

import me.koxrel.designpatterns.factory.model.CheeseBurger;
import me.koxrel.designpatterns.factory.model.GreekBurger;
import me.koxrel.designpatterns.factory.model.Hamburger;

public class SimpleHamburgerFactory {
    public Hamburger createHamburger(String type) {
        return switch (type) {
            case "cheese" -> new CheeseBurger();
            case "greek" -> new GreekBurger();
            default -> null;
        };
    }
}
