package me.koxrel.designpatterns.iterator.model;

import lombok.RequiredArgsConstructor;

import java.util.Iterator;

@RequiredArgsConstructor
public class DevStoreIterator implements Iterator {
    final Product[] catalog;
    int position;

    @Override
    public boolean hasNext() {
        return position < catalog.length && catalog[position] != null;
    }

    @Override
    public Object next() {
        return catalog[position++];
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("Can't remove an item until you've done at least one next()");
        }
        if (catalog[position - 1] == null) {
            for (int i = position - 1; i < catalog.length - 1; i++) {
                catalog[i] = catalog[i + 1];
            }
            catalog[catalog.length - 1] = null;
        }
    }
}
