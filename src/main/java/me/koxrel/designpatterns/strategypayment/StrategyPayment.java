package me.koxrel.designpatterns.strategypayment;

import me.koxrel.designpatterns.Driver;
import me.koxrel.designpatterns.strategypayment.controller.CreditCardPayment;
import me.koxrel.designpatterns.strategypayment.controller.PaypalPayment;
import me.koxrel.designpatterns.strategypayment.controller.ShoppingCart;
import me.koxrel.designpatterns.strategypayment.model.Product;

import java.math.BigDecimal;

public class StrategyPayment implements Driver {
    @Override
    public void run() {
        var cart = new ShoppingCart();

        cart.addProduct(new Product("234", new BigDecimal(25)));
        cart.addProduct(new Product("123", new BigDecimal(15)));

        cart.pay(new PaypalPayment("me@me.com", "super-secret"));
        cart.pay(new CreditCardPayment("Me Myself", "1234-5678-9012-3456"));
    }
}
