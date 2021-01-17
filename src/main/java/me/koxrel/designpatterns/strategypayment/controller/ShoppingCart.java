package me.koxrel.designpatterns.strategypayment.controller;

import lombok.NonNull;
import me.koxrel.designpatterns.strategypayment.model.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public BigDecimal calculateTotal() {
        return products.stream().map(Product::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void pay(@NonNull Payment payment) {
        payment.pay(calculateTotal());
    }
}
