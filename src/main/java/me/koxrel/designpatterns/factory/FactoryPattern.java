package me.koxrel.designpatterns.factory;

import me.koxrel.designpatterns.Driver;
import me.koxrel.designpatterns.factory.interfaces.HamburgerStore;
import me.koxrel.designpatterns.factory.model.Hamburger;
import me.koxrel.designpatterns.factory.model.JamHamburgerStore;
import me.koxrel.designpatterns.factory.model.MozHamburgerStore;

public class FactoryPattern implements Driver {
    @Override
    public void run() {
        MozHamburgerStore mozambicanBurgerStore = new MozHamburgerStore();
        HamburgerStore jamaicanBurgerStore = new JamHamburgerStore();

        Hamburger hamburger = mozambicanBurgerStore.orderHamburger("cheese");
        System.out.printf("I've ordered %s.\n\n", hamburger.getName());

        hamburger = jamaicanBurgerStore.orderHamburger("cheese");
        System.out.printf("Someone has ordered %s.\n", hamburger.getName());
    }
}
