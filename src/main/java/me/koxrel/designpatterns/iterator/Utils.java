package me.koxrel.designpatterns.iterator;

import me.koxrel.designpatterns.iterator.model.Product;

public class Utils {
    private Utils() {
    }

    public static void printProductInfo(Product product) {
        System.out.printf("Product '%s': {Description='%s', price=%.2f}%n", product.getName(),
                product.getDescription(), product.getPrice());
    }
}
