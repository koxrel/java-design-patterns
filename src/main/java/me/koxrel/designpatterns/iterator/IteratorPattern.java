package me.koxrel.designpatterns.iterator;

import me.koxrel.designpatterns.Driver;
import me.koxrel.designpatterns.iterator.interfaces.Catalog;
import me.koxrel.designpatterns.iterator.model.DevStoreCatalog;
import me.koxrel.designpatterns.iterator.model.GeekyStoreCatalog;

public class IteratorPattern implements Driver {
    @Override
    public void run() {
        Catalog devStoreCatalog = new DevStoreCatalog();

        Catalog geekyStoreCatalog = new GeekyStoreCatalog();

        Seller seller = new Seller(geekyStoreCatalog, devStoreCatalog);
        seller.printCatalog();
    }
}
