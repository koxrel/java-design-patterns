package me.koxrel.designpatterns.iterator;

import lombok.AllArgsConstructor;
import me.koxrel.designpatterns.iterator.interfaces.Catalog;
import me.koxrel.designpatterns.iterator.model.Product;

import java.util.Iterator;

import static me.koxrel.designpatterns.iterator.Utils.printProductInfo;

@AllArgsConstructor
public class Seller {
    Catalog geekyStoreCatalog;
    Catalog devStoreCatalog;

    public void printCatalog() {
        Iterator storeCatalogIterator = geekyStoreCatalog.createIterator();
        System.out.println("Printing Geeky catalog...");
        printCatalog(storeCatalogIterator);

        System.out.printf("----------%n");

        Iterator devStoreCatalogIterator = devStoreCatalog.createIterator();
        System.out.println("Printing Dev catalog...");
        printCatalog(devStoreCatalogIterator);
    }

    private void printCatalog(Iterator iterator) {
        while (iterator.hasNext()) {
            printProductInfo((Product) iterator.next());
        }
    }
}
