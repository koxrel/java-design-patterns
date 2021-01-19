package me.koxrel.designpatterns.factory.model;

public class JamaicanCheeseBurger extends Hamburger {
    public JamaicanCheeseBurger() {
        name = "Jamaican Style Cheese Burger";
        sauce = "Jamaican sauce";
        buns = "Jamaican buns";
    }

    @Override
    public void cook() {
        System.out.println("Cooking Jamaican style...");
    }
}
