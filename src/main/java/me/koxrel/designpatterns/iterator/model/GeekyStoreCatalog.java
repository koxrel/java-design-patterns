package me.koxrel.designpatterns.iterator.model;

import lombok.Getter;
import me.koxrel.designpatterns.iterator.interfaces.Catalog;

import java.util.ArrayList;

@Getter
public class GeekyStoreCatalog implements Catalog {
    private ArrayList<Product> catalog;

    public GeekyStoreCatalog() {
        catalog = new ArrayList<>();

        addItem("Geeky Item 1", "Geeky Desc 1", 139.99);
        addItem("Geeky Item 2", "Geeky Desc 2", 9.99);
        addItem("Geeky Item 3", "Geeky Desc 3", 19.99);
        addItem("Geeky Item 4", "Geeky Desc 4", 39.99);
    }

    public void addItem(String name, String description, double price) {
        Product product = new Product(name, description, price);
        catalog.add(product);
    }

    public GeekyStoreIterator createIterator() {
        return new GeekyStoreIterator(catalog);
    }
}

