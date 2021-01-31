package me.koxrel.designpatterns.iterator.model;

import me.koxrel.designpatterns.iterator.interfaces.Catalog;

public class DevStoreCatalog implements Catalog {
    private static final int MAX_ITEMS = 4;
    Product[] catalog;
    private int numberOfProducts;

    public DevStoreCatalog() {
        catalog = new Product[MAX_ITEMS];

        addItem("Dev Item 1", "Dev Desc 1", 39.99);
        addItem("Dev Item 2", "Dev Desc 2", 19.99);
        addItem("Dev Item 3", "Dev Desc 3", 139.99);
        addItem("Dev Item 4", "Dev Desc 4", 390.99);
    }

    public void addItem(String name, String description, double price) {
        Product product = new Product(name, description, price);

        if (numberOfProducts >= MAX_ITEMS) {
            System.out.println("Catalog is full - can't add products!");
        } else {
            catalog[numberOfProducts++] = product;
        }
    }

    public DevStoreIterator createIterator() {
        return new DevStoreIterator(catalog);
    }
}
