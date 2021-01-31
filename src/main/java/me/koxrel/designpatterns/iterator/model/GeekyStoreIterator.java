package me.koxrel.designpatterns.iterator.model;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Iterator;

@RequiredArgsConstructor
public class GeekyStoreIterator implements Iterator {
    final ArrayList<Product> catalog;
    int position;

    @Override
    public boolean hasNext() {
        return position < catalog.size() && catalog.get(position) != null;
    }

    @Override
    public Object next() {
        return catalog.get(position++);
    }
}
